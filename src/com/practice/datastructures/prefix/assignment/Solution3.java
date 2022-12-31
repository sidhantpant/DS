package com.practice.datastructures.prefix.assignment;

public class Solution3 {

    private static int[] prefixSum(int[] A, int[][] B) {
        int N = A.length;
        int[] PS = new int[N + 1];
        // 1 2 3 4 5
        // 0 1 3 6 10 15

        PS[0] = A[0];
        for (int i = 1; i < N + 1; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }
        int M = B.length;
        int[] rangeSum = new int[M];
        for (int j = 0; j < M; j++) {
            int start = B[j][0];
            int end = B[j][1];
            rangeSum[j] = PS[end] - PS[start - 1];
        }
        return rangeSum;
    }

    private static int[] prefix(int[] A) {
        int N = A.length;
        int[] prefix = new int[N];
        int sum = 0; // 1 2 3 4 5
        for (int i = 0; i < N; i++) {
            sum = sum + A[i];
            prefix[i] = sum; // 1 3 6 10 15
        }
        return prefix;

    }

    private static long[] rangeSumIndex(int[] A, int[][] B) {
        int N = A.length;
        long[] PS = new long[N];
        PS[0] = A[0]; // 1 2 3 4 5 // A[i-1]
        for (int i = 1; i < N; i++) {
            PS[i] = PS[i - 1] + A[i];
        }
        long[] range = new long[B.length];

        for (int i = 0; i < B.length; i++) {
            int start = B[i][0];
            int end = B[i][1];
            long sum;
            if (start - 1 <= 0) {
                sum = PS[end - 1];
            } else {
                System.out.println(end + "," + start);
                sum = PS[end - 1] - PS[start - 2];
            }
            range[i] = sum;
        }
        return range;
    }

    public static long[] rangeSumSol(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;
        long[] pref = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            pref[i] = pref[i - 1] + A[i - 1];   //Sum from the 0th to the i-1'th index
        }
        long[] ans = new long[m];
        for (int i = 0; i < m; i++) {
            int start = B[i][0];
            int end = B[i][1];
            ans[i] = pref[start] - pref[end - 1];
        }
        return ans;
    }

    public static long[] rangeSum1(int[] A, int[][] B) {
        int n = A.length;
        long[] prefSum = new long[n];
        prefSum[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefSum[i] = prefSum[i - 1] + A[i];
        }
        int j = 0;
        int test_cases = B.length;
        long[] out = new long[test_cases];
        while (j < test_cases) {
            int start = B[j][0] - 1; // index - 1 - 1(previous pos)
            int end = B[j][1] - 1;
            if (start - 1 < 0) {
                out[j] = prefSum[end];
            } else {
                out[j] = prefSum[end] - prefSum[start - 1];
            }
            j++;
        }
        return out;
    }

    private static int[] rangeSum(int[] A, int[][] B) {
        //[ 2 5 7 1   9  8 ]    N   2,5  - 22   3,5 -> 17
        //[ 0 2 7 14  15 24 32] N+1 2,5 ,  24-2 =22  , 3,5 =24-7 = 17

        // [ 1, 2, 3, 4, 5 ]  1,4 => 10 ,2,3 => 5
        // [ 0, 1, 3, 6, 10, 15]  1,4=> 10-0 = 10 =>6-1= 5
        int N = A.length;
        int[] PS = new int[N + 1];
        PS[0] = 0;
        for (int i = 1; i < N + 1; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }

        int[] range = new int[B.length];

        for (int i = 0; i < B.length; i++) {
            int start = B[i][0];
            int end = B[i][1];

            int rangeSum = PS[end] - PS[start - 1];
            range[i] = rangeSum;
        }
        return range;
    }


    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{1, 4}, {2, 3}};

        int[] C = {7, 3, 1, 5, 5, 5, 1, 2, 4, 5};
        int[][] D = {{7, 10}, {3, 10}, {3, 5}, {1, 10}};
        prefix(C);
//        System.out.println(rangeSum(C, D));
//        System.out.println(rangeSum1(C, D));
//        System.out.println(rangeSumSol(C, D));
    }
}
