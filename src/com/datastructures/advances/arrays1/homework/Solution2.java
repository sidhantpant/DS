package com.datastructures.advances.arrays1.homework;

public class Solution2 {

    public static int[] plusOne(int[] A) {

        int N = A.length;
        int carry = 0;
        if (N == 1) {
            A[0] = A[0] + 1;
            return A;
        }
        for (int i = N - 1; i >= 0; i--) {

            if (A[i] == 9) {
                A[i] = 0;
                carry = 1;
            } else {
                A[i] = carry + A[i];
                carry = 0;
            }
            if (i == 0 && A[i] == 0) {
                A = new int[N + 1];
                A[0] = 1;
            }

        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {1, 9, 3,9};
        System.out.println(plusOne(A));
    }
}
