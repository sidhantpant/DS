package com.revision.datastructures.introarrays.homework;

/*You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.*/
public class Solution4 {

    private static int[] solveRangeSum(int[] A, int[][] B) {

        int N = A.length;
        int[] sumArray = new int[B.length];
        for (int i = 0; i < N; i++) {
            int sum = 0;
            int start = B[i][0];
            int end = B[i][1];
            for (int j = start; j < end; j++) {
                sum = sum + A[j];
            }
            sumArray[i] = A[i];
        }
        return sumArray;

    }

    private static int[] rangePrefixSum(int[] A, int[][] B) {
        int N = A.length;
        int[] PS = new int[N + 1];
        PS[0] = 0;
        for (int i = 1; i < N + 1; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }
        int[] rangeSumArray = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            int start = B[i][0];
            int end = B[i][1];
            int rangeSum = PS[end] - PS[start - 1];
            rangeSumArray[i] = rangeSum;
        }
        return rangeSumArray;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{1, 4}, {2, 3}};
        rangePrefixSum(A, B);
    }

}
