package com.practice.datastructures.subarrays.homework;

public class Solution9 {

    private static int maxTotalSubarray(int A, int B, int[] C) {
        int N = C.length;
        int maxSum = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum += C[j];
                if (sum <= B) {
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
//        int[] A = {2, 1, 3, 4, 5};
//        int[] C = {2, 2, 2};
        int[] C = {7, 1, 8, 5, 8, 5, 3, 3, 5};
        System.out.println(maxTotalSubarray(9, 78, C));
    }

}
