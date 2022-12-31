package com.practice.datastructures.slidingwindow.classroom;

public class MinSubarraySumk {

    private static void minSubarraySumK(int[] A, int k) {

        int N = A.length;
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + A[i];
        }
        int s = 1;
        int e = k;
        while ( s < N-k+1 ){ // e<N
            sum = sum - A[s-1] + A[e];
            minSum = Math.min(minSum , sum);
            s++;
            e++;
        }
        System.out.println(minSum);
    }

    public static void main(String[] args) {
        int[] A = {-3, 4, -2, 5, 3, -2, 8, 2, -1, 4};
        minSubarraySumK(A, 5);
    }
}
