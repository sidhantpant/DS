package com.datastructures.advances.arrays1.classroom;

public class Solution2 {

    private static int[] sum(int[] A, int[][] Q) {
        for (int i = 0; i < Q.length; i++) {
            int index = Q[i][0];
            int val = Q[i][1];
            A[index] = val;

        }
        int N = A.length;
        A[0] = 0;
        for (int i = 1; i < N; i++) {
            A[i] = A[i - 1] + A[i];
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {0, 0, 0, 0, 0, 0, 0};
        int[][] Q = {{1, 3}, {4, 2}, {2, 1}};
        // 0 3 1 0 2 0 0
        sum(A, Q);
    }

}
