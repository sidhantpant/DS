package com.practice.datastructures.subarrays.assignment;

public class Solution5 {

    public static int solve(int[] A, int B) {
        int N = A.length;
        int count = 0;
        for (int i = 0; i < N; i++) {
            int sumEven = 0;
            //for even
            for (int j = i + 1; j < N; j = j + 2) {
                sumEven = sumEven + A[j];
                if (sumEven < B) {
                    count++;
                }
            }
            //for odd
            int sumOdd = 0;
            for (int k = i; k < N; k = k + 2) {
                sumOdd = sumOdd + A[k];
                if (sumOdd > B) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int solvePrefix(int[] A, int B) {
        int N = A.length;
        int[] PS = new int[N + 1];
        PS[0] = 0;
        for (int i = 1; i < N; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            int sumEven = 0;
            //for even
            for (int j = i + 1; j < N; j = j + 2) {
                sumEven = sumEven + PS[j + 1] - PS[i];
                if (sumEven < B) {
                    count++;
                }
            }
            //for odd
            int sumOdd = 0;
            for (int k = i; k < N; k = k + 2) {
                sumOdd = sumOdd + PS[k + 1] - PS[i];
                if (sumOdd > B) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] A1 = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        int[] A2 = {9, 12, 17, 9, 17, 16, 6, 4, 3, 8, 5, 13, 2, 9, 3, 13, 11};
        int[] A3= {3, 12, 11, 11, 11, 15 };
        System.out.println(solve(A1, 5));
//        System.out.println(solvePrefix(A3, 12));
    }

}
