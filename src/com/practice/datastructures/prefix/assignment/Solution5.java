package com.practice.datastructures.prefix.assignment;

public class Solution5 {

    /* You are given an array A of integers of size N.
     Your task is to find the equilibrium index of the given array
     Problem Constraints
     1 <= N <= 105
     -105 <= A[i] <= 105*/
    private static int equilibriumIndex(int[] A) {
        int N = A.length;
        for (int i = 0; i < N; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < i; j++) {
                sumLeft += A[j];
            }
            for (int j = i + 1; j < N; j++) {
                sumRight += A[j];
            }
            if (sumLeft == sumRight) {
                return i;
            }
        }
        return -1;
    }

    private static int equilibriumSlightlyOpt(int[] A) {
        int N = A.length;
        int[] PS = new int[N];
        PS[0] = A[0];
        for (int i = 1; i < N; i++) {
            PS[i] = PS[i - 1] + A[i];
        }
        for (int j = 0; j < N; j++) {
            int SL;
            int SR;
            if (j == 0) {
                SL = 0;
            } else {
                SL = PS[j - 1];
            }
            SR = PS[N - 1] - PS[j];
            if (SL == SR) {
                return j;
            }
        }
        return -1;
    }

    private static int equilibriumPrefix(int[] A) {

        int N = A.length;
        int[] PS = new int[N + 1];
        PS[0] = 0;
        for (int i = 1; i < N + 1; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }
        int B = PS.length;
        for (int i = 1; i < B; i++) {
            int sumLeft = PS[i - 1];
            int sumRight = PS[B - 1] - PS[i];
            if (sumLeft == sumRight) {
                return i - 1;
            }
        }
        return -1;
    }

    private static int equilibriumPrefix1(int[] A) {

        int N = A.length;
        int[] PS = new int[N + 1];
        PS[0] = 0;
        for (int i = 1; i < N + 1; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }
        int B = PS.length;

        // ITERATE ON A with index 0
//        for (int i = 0; i < N; i++) {
//            int sumLeft = PS[i];
//            int sumRight = PS[N] - PS[i+1];
//            if (sumLeft == sumRight) {
//                return i;
//            }
//        }
//         B-1 = N
        // ITERATE ON A With index 1
//        for (int i = 1; i < N; i++) {
//            int sumLeft = PS[i-1];
//            int sumRight = PS[N] - PS[i];
//            if (sumLeft == sumRight) {
//                return i-1;
//            }
//        }
//
//        ITERATE ON PS With index 1
//        for (int i = 0; i < B-1; i++) {
//            int sumLeft = PS[i];
//            int sumRight = PS[B-1] - PS[i + 1];
//            if (sumLeft == sumRight) {
//                return i;
//            }
//        }

//        B-1 = N
        // ITERATE ON PS With index 1
        for (int i = 1; i < B-1; i++) {
            int sumLeft = PS[i-1];
            int sumRight = PS[B-1] - PS[i];
            if (sumLeft == sumRight) {
                return i-1;
            }
        }


        return -1;
    }


    private static int equilibriumPrefixApproach1(int[] A) {
        long sum1 = 0;
        for (int i = 0; i < A.length; i++) sum1 += A[i];
        long sum2 = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            sum1 = sum1 - A[i];
            if (sum1 == sum2) {
                ans = i;
                break;
            }
            sum2 = sum2 + A[i];
        }
        if (ans == Integer.MAX_VALUE) ans = -1;
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        int[] A1 = {1, 2, 3, 4, 5, 1};
        int[] A2 = {1, 0, 1};
//        System.out.println(equilibriumIndex(A1));
//        System.out.println(equilibriumPrefix(A));
        System.out.println(equilibriumPrefix(A2));
//        System.out.println(equilibriumPrefix1(A1));
//        equilibriumPrefixApproach1(A1);
    }


    /*
    If its a 0 index
    PS[i] = PS[end+1]-PS[start]

    If its a 1 indexed
    PS[i] = PS[end] - PS[start-1]
     */
}
