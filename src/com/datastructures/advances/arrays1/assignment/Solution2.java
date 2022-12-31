package com.datastructures.advances.arrays1.assignment;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    private static int[] solve(int A, int[][] B) {
        int[] M = new int[A];
        for (int i = 0; i < B.length; i++) {
            int startIndex = B[i][0];
            int endIndex = B[i][1];
            int value = B[i][2];
            startIndex = startIndex - 1;
            endIndex = endIndex - 1;
            M[startIndex] = M[startIndex] + value;
            if (!(endIndex == A - 1)) {
                M[endIndex + 1] = M[endIndex + 1] - value;
            }
        }
        int N = M.length;
        for (int i = 1; i < N; i++) {
            M[i] = M[i - 1] + M[i];
        }

        return M;
    }

    public static void main(String[] args) {
        int A = 5;
        int[][] B = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        solve(A, B);
        //   10  20 -10 -20 0 // 10 30 20 0 20
        //    1   2  3   4  5
        //    10  10
        //    10  30 20
        //    10  55 45 25 25
        //    10  55 45 25 25 - final
        //    0   1  2  3  4
    }
}
