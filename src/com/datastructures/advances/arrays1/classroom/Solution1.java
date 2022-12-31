package com.datastructures.advances.arrays1.classroom;

public class Solution1 {

    private static int sumBruteForce(int[] A) {

        int N = A.length;
        int maxSum = 0;
        for (int i = 0; i < N; i++) {
            int currSum = 0;
            for (int j = i; j < N; j++) {
                currSum = printSum(A, i, j);
                maxSum = Math.max(currSum, maxSum);
            }

        }
        return maxSum;
    }

    private static int sumPrefixSum(int[] A) {

        int N = A.length;
        int maxSum = 0;
        int[] PS = new int[N+1];
        PS[0] = 0;
        for (int i = 1; i < N+1; i++) {
            PS[i] = PS[i-1] + A[i-1];
        }
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int sum = PS[j+1] - PS[i];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    private static int sumCarryForwardSum(int[] A) {

        int N = A.length;
        int maxSum = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum = sum + A[j];
                maxSum = Math.max(sum, maxSum);
            }

        }
        return maxSum;
    }

    private static int printSum(int[] A, int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum = sum + A[k];
        }
        return sum;
    }

    private static int sumKadanesOptimised(int[] A) {

        int max_sum = A[0];
        int curr_sum = A[0];
        int N = A.length;
        for (int i = 1; i < N; i++) { // unintentionally i=0 gives correct ans but it should run from i=1
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            curr_sum = curr_sum + A[i];
            max_sum = Math.max(max_sum, curr_sum);

        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] A = {-10,4,5,-1,2,-6};
//        System.out.println(sum(A));
        System.out.println(sumPrefixSum(A));
        System.out.println(sumCarryForwardSum(A));
        System.out.println(sumKadanesOptimised(A));

    }
}
