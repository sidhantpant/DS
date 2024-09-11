package com.interview.datastructures.advanced.arrays1.homework;

public class AddOneNumber {

    public static void main(String[] args) {
        int[] A = {9, 9, 9, 9, 9};
        AddOneNumber d = new AddOneNumber();
        int[] ans = d.plusOne(A);
    }

    public int[] plusOne(int[] A) {
        int N = A.length;
        int c = 1;

        for (int i = N - 1; i >= 0; i--) {
            int num = A[i];
            int sum = num + c;
            c = sum / 10;
            int d = sum % 10;
            A[i] = d;
        }
        int[] ans;
        if (c > 0) {
            ans = new int[N + 1];
            ans[0] = c;
            for (int i = 0; i < N; i++) {
                ans[i + 1] = A[i];
            }
            return ans;
        }
        return A;

    }


}
