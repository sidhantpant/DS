package com.datastructures.advances.arrays1.assignment;

public class Solution1 {


    private void maxSumBruteForce(int[] A){
        int N = A.length;
        int maxSum = 0 ;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum = A[i]-A[j] + (i-j);

            }
        }

    }

}
