package com.practice.datastructures.slidingwindow.classroom;

public class SubarraySum {

    private static void printSubArray(int[] A, int k) {
        int N = A.length;
        for (int i = 0; i < N - k + 1; i++) {
            int sum = 0;
            for (int j = i; j < k + i; j++) {
                sum += A[j];
            }
            System.out.print(sum + " ");
        }

    }

    private static void printSubArray1(int[] A, int k) {
        int N = A.length;
        int s = 0;
        int e = k - 1;
        while (e < N) {
            int sum = 0;
            for (int i = s; i <= e; i++) {
                sum = sum + A[i];
            }
            System.out.print(sum + " ");
            s++;
            e++;
        }
    }

    private static void printSubArrayPrefix(int[] A, int k) {
        int N = A.length;
        int start = 0;
        int end = k - 1;
        int[] PS = new int[N + 1];
        int B = PS.length;
        PS[0] = 0;
        for (int i = 1; i <= N; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }
        while (end < N) {
            int sum = PS[end + 1] - PS[start];
            start++;
            end++;
            System.out.println(sum);
        }

    }

    public static void main(String[] args) {
        int[] A = {-3, 4, -2, 5, 3, -2, 8, 2, -1, 4};
        printSubArray(A, 5);
        printSubArray1(A, 5);
        printSubArrayPrefix(A, 5);
    }


}
