package com.practice.datastructures.carryforward;

public class Stock {

    private static int stock(int[] A) {
        int N = A.length;
        int profit = 0;
        for (int i = 0; i < N; i++) {
            int minLeft = A[i];
            minLeft = findMinLeft(A, i, minLeft);

            int maxRight = A[i];
            maxRight = findMaxRight(A, i, maxRight);
            if (maxRight > minLeft) {
                profit = Math.max(profit, maxRight - minLeft);
            }

        }
        if (profit > 0) {
            return profit;
        }
        return 0;

    }

    private static int findMinLeft(int[] A, int i, int minLeft) {
        for (int j = 0; j < i; j++) {
            minLeft = Math.min(minLeft, A[j]);
        }
        return minLeft;
    }

    private static int findMaxRight(int[] A, int i, int maxRight) {
        for (int j = i + 1; j < A.length; j++) {
            maxRight = Math.max(maxRight, A[j]);
        }
        return maxRight;
    }

    public static void main(String[] args) {
        int[] A = {};
        stock(A);

    }

}