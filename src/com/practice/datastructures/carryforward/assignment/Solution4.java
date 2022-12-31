package com.practice.datastructures.carryforward.assignment;

public class Solution4 {

    private static int solve(int[] A) {
        int N = A.length;
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

        int lmax = -1;
        int lmin = -1;
        int length = N;

        for (int i = 0; i < N; i++) {
            Max = Math.max(Max, A[i]);
            Min = Math.min(Min, A[i]);
        }

        for (int i = 0; i < N; i++) {

            if (A[i] == Min) {
                lmin = i;
                if (lmax >= 0) {
                    length = Math.min(length, i - lmax + 1);
                }
            }

            if (A[i] == Max) {
                lmax = i;
                if (lmin >= 0) {
                    length = Math.min(length, i - lmin + 1);
                }
            }
        }
        return length;
    }
}
