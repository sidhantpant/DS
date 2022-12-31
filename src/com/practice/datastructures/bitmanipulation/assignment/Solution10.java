package com.practice.datastructures.bitmanipulation.assignment;

public class Solution10 {

    private static int singleNumber(int[] A) {
        int N = A.length;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = ans ^ A[i];
            System.out.println(ans);
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] A = {1, 2, 5, 2, 3, 1, 5};
        singleNumber(A);
    }
}
