package com.interview.datastructures.advanced.arrays1.classroom;

public class MaxSubarrySum {

    public void maxSubarraySum(int[] A) {

        int N = A.length;
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {

            curr_sum = curr_sum + A[i];
            max_sum = Math.max(curr_sum, max_sum);
            if (curr_sum <= 0) {
                curr_sum = 0;
            }
        }


    }

}
