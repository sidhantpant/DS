package com.practice.datastructures.sorting.assignment;

import java.util.Arrays;

public class Solution3 {

    private static int solve(int[] A) {
        int N = A.length;
        Arrays.sort(A);
        int val = A[1] - A[0];
        for (int i = 0; i < N - 1; i++) {

                if (!(A[i + 1] - A[i] == val)) {
                    return 0;
                }
        }
        return 1;

    }

    public static void main(String[] args) {
        int[] A = {2, 4, 1 };
        String a;


        solve(A);
    }

}
