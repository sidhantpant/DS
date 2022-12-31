package com.practice.datastructures.prefix.classrooom;

import java.util.Scanner;

public class SumQueries {

    private static void sum(int[] A, int Q) {

        for (int i = 1; i <= Q; i++) {
            int sum = 0;
            Scanner scanner = new Scanner(System.in);
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            while (start <= end) {
                sum += A[start];
                start++;
            }

            System.out.println("sum=" + sum);
        }  // TC = O(Q*N)
    }

    private static void prefixSum(int[] A, int Q) {
        int N = A.length;
        int[] PS = new int[N];
        PS[0] = A[0];
        for (int i = 1; i < N; i++) {
            PS[i] = PS[i - 1] + A[i];
        }

        for (int i = 1; i <= Q; i++) {
            Scanner scanner = new Scanner(System.in);
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int rangeSum;

            if (start == 0) {
                rangeSum = PS[end];
            } else {
                rangeSum = PS[end] - PS[start - 1];
            }
            System.out.println(rangeSum);
        }


    }

    public static void main(String[] args) {
        int[] A = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
//        sum(A,4);
        prefixSum(A, 4);
    }
}
