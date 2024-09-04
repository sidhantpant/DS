package com.revision.datastructures.slidingwindow.homework;

import java.util.Arrays;

public class SubArrayRotation {
    public static void main(String[] args) {
        int[] A = {6,31,33,13,82,66,9,12,69,21,17,2,50,69,90,71,31,1,13,70,94,46,89,13,55,54,67,97,28,27,62,34,41,18,15,35,13,84,93,27,89,23,6,56,94,40,54,95,47};
        int[] B = {88,85,98,36,66,40,30,26,51,77,62,60,92,64,53,86,24,53,85,49,57,29,32,60,75,82,17,23,67,51,23,11,70,59};
        SubArrayRotation sb = new SubArrayRotation();
        sb.rotateArraysLeft(A, B);
    }

    public int[][] rotateArraysLeft(int[] A, int[] B) {
        int N = A.length;
        int M = B.length;
        int[][] finalArray = new int[M][N];
        for (int i = 0; i < M; i++) {
            int K = B[i] % N;
            K = N - K;
            int[] C = Arrays.copyOf(A, N);
            reverse(C, 0, N - 1);
            reverse(C, 0, K - 1);
            reverse(C, K, N - 1);
//            finalArray[i] = C;
            for (int z = 0; z < N; z++) {
                finalArray[i][z] = C[z];
            }

        }
        return finalArray;
    }


    public int[] reverse(int[] A, int start, int end) {
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
        return A;
    }
}
