package com.practice.datastructures.slidingwindow.homework;

import java.util.Arrays;

public class Solution1 {

    private static int[][] rotate(int[] A, int[] B) {

        int N = A.length;
        int M = B.length;

        int[][] result = new int[M][N];
        for (int k = 0; k < M; k++) {
            int[] duplicateArray = Arrays.copyOf(A, N);
            int rotate = B[k] % N;
            for (int m = 0; m < rotate; m++) {
                int a = duplicateArray[0];
                for (int i = 1; i < N; i++) {
                    duplicateArray[i - 1] = duplicateArray[i];
                }
                duplicateArray[N - 1] = a;
                result[m] = duplicateArray;
            }

        }
        System.out.println(A);
        return result;
    }

    private static int[][] rotateSlidingWindow(int[] A, int[] B) {
        int N = A.length;
        int M = B.length;
        int[][] finalArray = new int[M][N];
        for (int j = 0; j < M; j++) {
            int K = B[j] % N;
            int[] C = Arrays.copyOf(A, N);
            reverse(C, 0, N - 1);
            reverse(C, 0, N - K - 1);
            reverse(C, N - K, N - 1);
            for (int z = 0; z < N; z++) {
                finalArray[j][z] = C[z];
            }
        }
        return finalArray;
    }

    private static void reverse(int[] A, int start, int end) {
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 3};
        int[][] arr = rotateSlidingWindow(A, B);
        System.out.println(arr);
    }
}
