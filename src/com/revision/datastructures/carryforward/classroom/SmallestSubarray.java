package com.revision.datastructures.carryforward.classroom;

public class SmallestSubarray {

    private static int smallesSubarryMinMaxBF(int[] A) {
        int N = A.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }
        int length = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (A[i] == min) {
                for (int j = i + 1; j < N; j++) {
                    if (A[j] == max) {
                        length = Math.max(length, j - i + 1);
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (A[i] == max) {
                for (int j = i + 1; j < N; j++) {
                    if (A[j] == min) {
                        length = Math.min(length, j - i + 1);
                    }
                }
            }
        }

        return length;

    }

    public static void main(String[] args) {
        int[] A = {2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1};
        System.out.println(smallesSubarryMinMaxBF(A));
    }
}
