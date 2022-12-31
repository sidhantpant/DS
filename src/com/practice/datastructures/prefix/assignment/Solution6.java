package com.practice.datastructures.prefix.assignment;

public class Solution6 {

    private static int[] rangeQueries(int[] A, int[][] Q) {
        int N = A.length;
        int[] evenArray = new int[N];

        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 0) {
                evenArray[i] = 1;
            } else {
                evenArray[i] = 0;
            }
        }
        // create a Prefix array
        int[] PS = new int[N];
        PS[0] = evenArray[0] % 2 == 0 ? 1 : 0;
        for (int i = 1; i < N; i++) {
            if (evenArray[i] == 1) {
                PS[i] = PS[i - 1] + evenArray[i];
            } else {
                PS[i] = PS[i - 1];
            }
        }
        int[] range = new int[Q.length];
        for (int i = 0; i < Q.length; i++) {
            int start = Q[i][0];
            int end = Q[i][1];
            if (start == 0 && end == 0) {
                range[i] = 0;
            } else if (start - 1 <= 0) {
                range[i] = PS[end - 1];
            } else {
                range[i] = PS[end - 1] - PS[start - 2];
            }
        }
        return range;
    }

    private static int[] solve(int[] A, int[][] B) {
        //create even number array
        int N = A.length;
        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 0) {
                A[i] = 1;
            } else {
                A[i] = 0;
            }
        }
        int[] PS = new int[N + 1]; // 1 0 1 1 0 1 1
        PS[0] = A[0];              // 0 1 1 2 3 3 4 5
        for (int i = 1; i < N + 1; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }
        int M = B.length;
        int[] total = new int[M];
        for (int i = 0; i < M; i++) {
            int start = B[i][0];
            int end = B[i][1];
            total[i] = PS[end] - PS[start - 1];
        }
        return total;
    }

    private static int[] evenRangeSum(int[] A, int[][] B) {
        // 2 2 3 6 5 9
        // 0 1 2

        int N = A.length;
        int[] PS = new int[N + 1];
        PS[0] = 0;
        for (int i = 1; i < N + 1; i++) {
            if (A[i - 1] % 2 == 0) {
                PS[i] = PS[i - 1] + 1;
            } else {
                PS[i] = PS[i - 1];
            }
        }
        int M = B.length;
        int[] total = new int[M];
        for (int i = 0; i < M; i++) {
            int start = B[i][0];
            int end = B[i][1];
            total[i] = PS[end] - PS[start - 1];
        }
        return total;
    }

    public static void main(String[] args) {
        // [1, 1, 1, 2, 2, 3., 3., 3, 3]
        int[] A = {3, 3, 3, 6, 7, 8, 7, 3, 7};
        int[] A1 = {2, 2, 3, 6, 7, 8, 7, 3, 7};// 0 1 2 2 3 3 4 4 4 4
//                  0  1  2  2  3  3  4  4  4  4
//                  0  2  4  7  13 20 28 35 38 45
        int[][] B = {{2, 6}, {4, 7}, {6, 7}};
//        int[] C = rangeQueries(A, B);
//        solve(A, B);
        evenRangeSum(A1, B);

        //  2 4 6 8 1 3 4 2 2
        //0 1 2 3 4 4 4 5 6 7
    }

}
