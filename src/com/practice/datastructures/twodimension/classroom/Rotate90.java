package com.practice.datastructures.twodimension.classroom;

public class Rotate90 {

    private static void rotateMatrix90(int[][] A) {
        int N = A.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // swap A[i][j] with A[j][i]
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
            // reverse each row
        }
        for (int j = 0; j < N; j++) {
            for (int k = 0; k < N / 2; k++) {
                int temp = A[j][k];
                A[j][k] = A[j][N - 1 - k];
                A[j][N-1-k] = temp;
            }
        }
        System.out.println(A);
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        rotateMatrix90(A);
    }

}
