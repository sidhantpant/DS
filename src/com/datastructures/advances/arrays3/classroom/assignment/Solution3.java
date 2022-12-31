package com.datastructures.advances.arrays3.classroom.assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution3 {

    private static int missingPositiveBruteForce(int[] A) {

        int N = A.length;
        for (int i = 1; i < N; i++) {
            boolean isPresent = false;
            for (int j = 0; j < N; j++) {
                if (A[j] < N && A[j] == i) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                return i;
            }
        }
        return -1;
    }

    private static int firstMissingPositive(int[] X) {

        int N = X.length;
        for (int i = 1; i < N + 1; i++) {
            boolean missingFlag = true;
            for (int j = 0; j < N; j++) {
                if (X[j] == i) {
                    missingFlag = false;
                    break;
                }
            }
            if (missingFlag) {
                return i;
            }
        }
        return -1;
    }

    private static int missingPositiveUsingExtraSpace(int[] A) {
        Map<Integer, Boolean> integerMap = new HashMap<>();
        int N = A.length;
        for (int i = 0; i < N; i++) {
            integerMap.put(A[i], true);
        }
        for (int i = 0; i < N; i++) {
            if (!integerMap.containsKey(i)) {
                return i;
            }
        }
        return -1;
    }
    // 1,4  3,2  5,0
    // 1 3 4 5 6

    private static int missingPositiveSorting(int[] A) {
        Arrays.sort(A);
        int ans = 1;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            if (A[i] > 0) {
                if (A[i] == ans) {
                    ans++;
                } else {
                    break;
                }
            }

        }
        return ans;
    }


    private static int missingPositiveOptimised(int[] A) {
        int N = A.length;
        for (int i = 0; i < N; i++) {
            while (A[i] >= 1 && A[i] <= N && A[i] != A[A[i] - 1]) {
//                int temp = A[i];
//                A[i] = A[A[i] - 1];
//                A[temp-1] = temp;
                int temp = A[A[i] - 1];//4, 3, 1, -2, 5 //-2 3 1 4 5//
                A[A[i] - 1] = A[i];
                A[i] = temp;
            }
        }
        for (int i = 0; i < N; i++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }
        return N + 1;
    }

    public static void main(String[] args) {
        int[] A = {10, -1, 9, 3, 2, 1, 8, 5, -11, 4};
        int[] A1 = {4, 3, 1, -2, 5};// -2 1 3 4 5
        System.out.println(missingPositiveBruteForce(A));
//        System.out.println(firstMissingPositive(A));
        System.out.println(missingPositiveSorting(A));
        System.out.println(missingPositiveOptimised(A1));
    }
}
