package com.practice.datastructures.slidingwindow.classroom;

public class MaxSubarraySum {

    private static void maxSubArraySumK(int[] A, int k) {
        int N = A.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + A[i];
        }
        maxSum = Math.max(maxSum, sum);
        int s = 1;
        int e = k;
//        while(e<N){
//            sum = sum + A[s-1] + A[e];
//            s++;
//            e++;
//        }

        for (int i = e; i < N; i++) {
            sum =  sum - A[s - 1] + A[e];
            s++;
            e++;
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);

    }

    private static void maxSubArraySumK1(int[] A, int k) {
        int N = A.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + A[i];
        }
        maxSum = Math.max(maxSum, sum);
        int s = 1;
        int e = k;
        while (e < N) {
            sum = sum - A[s - 1] + A[e];
            maxSum = Math.max(maxSum,sum);
            s++;
            e++;
        }
        System.out.println(maxSum);

    }

    public static void main(String[] args) {
        int[] A = {-3, 4, -2, 5, 3, -2, 8, 2, -1, 4};
        maxSubArraySumK(A, 5);
        maxSubArraySumK1(A, 5);
    }
}
