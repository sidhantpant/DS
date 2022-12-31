package com.revision.datastructures.subarrays.assignment;

import java.util.ArrayList;
import java.util.List;

public class Solution6 {

    private static int[] alternatingSubArrayBruteForce(int[] A, int B) {

        int length = 2 * B + 1;
        int N = A.length;
        List<Integer> alterList = new ArrayList<>();
        for (int i = 0; i <= N - length; i++) {
            for (int j = i; j < i + length - 1; j++) {
                if (A[j] == A[j + 1]) {
                    break;
                }
            }
            int mid = i+B;
            alterList.add(mid);
        }
        int[] alterArray = new int[alterList.size()];
        for (int i = 0; i < alterList.size(); i++) {
            alterArray[i] = alterList.get(i);
        }
        return alterArray;
    }

    public static void main(String[] args) {
        int[] A = {0, 0, 0, 1, 1, 0, 1};
        alternatingSubArrayBruteForce(A, 0);
    }

}
