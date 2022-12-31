package com.practice.datastructures.carryforward.homework;

public class Solution1 {

    public int maxProfit(final int[] A) {
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

    private int findMinLeft(int[] A, int i, int minLeft) {
        for (int j = 0; j < i; j++) {
            minLeft = Math.min(minLeft,A[j]);
        }
        return minLeft;
    }

    private int findMaxRight(int[] A, int i, int maxRight) {
        for (int j = i+1; j < A.length; j++) {
            maxRight = Math.max(maxRight,A[j]);
        }
        return maxRight;
    }

    private static int maximumProfitEasy(int[] A){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int N = A.length;
        for (int i = 0; i < N; i++) {
           max = Math.max( max ,A[i]);
           min = Math.min( min ,A[i]);

           if(max > min){
               return max - min;
           }
        }
        return 0;

    }

}
