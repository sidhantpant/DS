package com.practice.datastructures.interviewproblem1.homework;

public class Solution1 {


    private static int solve(int[] A, int[] B) {

        int N = A.length;
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {

                    if ((A[i] < A[j]) && (A[j] < A[k])) {
                        sum = Math.min(sum, B[i] + B[j] + B[k]);
                    }

                }
            }
        }
        if (sum == Integer.MAX_VALUE) {
            return -1;
        }
        return sum;

    }

    private static int solveOptimise(int[] A, int[] B) {

        int N = A.length;
        int totalMin = Integer.MAX_VALUE;
        for (int q = 1; q < N - 1; q++) {
            int leftMin = Integer.MAX_VALUE;
            int rightMin = Integer.MAX_VALUE;
            int sum = 0;
            for (int p = q - 1; p >= 0; p--) {
                if (A[p] < A[q]) {
                    leftMin = Math.min(leftMin, B[p]);
                }
            }

            for (int p = q + 1; p < N; p++) {
                if (A[p] > A[q]) {
                    rightMin = Math.min(rightMin, B[p]);
                }
            }

            if (leftMin != Integer.MAX_VALUE && rightMin != Integer.MAX_VALUE) {
                sum = B[q] + leftMin + rightMin;
                totalMin = Math.min(totalMin, sum);
            }
        }
        if (totalMin == Integer.MAX_VALUE) {
            return -1;
        }
        return totalMin;
    }

    public static void main(String[] args) {
        int[] A = {100, 101, 100};
        int[] B = {2, 4, 5};

        int[] A1 = {1, 3, 5};
        int[] B1 = {1, 2, 3};
        System.out.println(solveOptimise(A1, B1));
    }
}
