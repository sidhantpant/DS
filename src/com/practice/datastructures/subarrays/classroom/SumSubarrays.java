package com.practice.datastructures.subarrays.classroom;

public class SumSubarrays {

    private static void printSumSub(int[] A) {

        int N = A.length;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                for (int k = i; k <= j; k++) {
                    sum = sum + A[k];
                }
            }
        }
        System.out.println(sum);
    }

    private static void printSumSubArrayOptimizedPS(int[] A) { // O(N^2)
        int N = A.length;
        int[] PS = new int[N + 1];
        PS[0] = 0;
        for (int i = 1; i < N + 1; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }

        int sum = 0 ;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                sum = sum + PS[j + 1] - PS[i];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }

    private static void printSumSubArrayOptimizedCF(int[] A) {  // O(N^2)
        int N = A.length;

        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum = sum + A[j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }


    private static void sumSubArray(int[] A, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + A[i];
        }
        System.out.print(sum + " ");
    }

    private static void prefixSumSubArray(int[] PS, int start, int end) {
        int sum = PS[end + 1] - PS[start];
        System.out.print(sum + " ");
    }


    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        printSumSub(A);
//        printSubArray(A, 0, 3);
//        printSumSubArray(A);
        printSumSubArrayOptimizedPS(A);
//        printSumSubArrayOptimizedCF(A);

    }

}
