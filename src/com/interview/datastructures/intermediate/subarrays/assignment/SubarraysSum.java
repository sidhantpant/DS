package com.interview.datastructures.intermediate.subarrays.assignment;

public class SubarraysSum {

    public void subArraySum(int[] A, int B){

        int N = A.length;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i+1; j < N; j++) {
                sum = sum+A[j];
                System.out.println(sum);
            }
        }

    }
}
