package com.practice.datastructures.subarrays.homework;

public class Solution1 {

    public static int maxProfit(final int[] A) {
        int N = A.length;
        int MAX_ELEM = -1000000;
        int MAX_PROFIT = 0;
        for (int i = N - 1; i >= 0; i--) {
            MAX_PROFIT = Math.max(MAX_PROFIT, MAX_ELEM - A[i]);
            MAX_ELEM = Math.max(MAX_ELEM, A[i]);
        }
        return MAX_PROFIT;
    }

    public static int maxProfitReverse(final int[] A) {
        int N = A.length;
        int MIN_ELEM = 1000000;
        int MAX_PROFIT = 0;
        for (int i = 0; i < N; i++) {
            MAX_PROFIT = Math.max(MAX_PROFIT, A[i] - MIN_ELEM);
            MIN_ELEM = Math.min(MIN_ELEM, A[i]);
        }
        return MAX_PROFIT;
    }

    public static void main(String[] args) {
        int[] A = {2, 1};
        System.out.println(maxProfit(A));
        System.out.println(maxProfitReverse(A));
    }
}
