package com.practice.datastructures.arrays1.homeowork;

public class Solution5 {

    private static int solve(int[] A) {

        // 1  4 2 3
        int max = Integer.MIN_VALUE;
        int N = A.length;
        int seconds = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        for (int i = 0; i < N; i++) {
            seconds = seconds + (max - A[i]);
        }
        return seconds;
    }

    public static void main(String[] args) {
        int[] A = { 731, 349, 490, 781, 271, 405, 811, 181, 102, 126, 866, 16, 622, 492, 194, 735};
        int[] A1 = {2,4,1,3,2};
        System.out.println(solve(A1));
    }


}
