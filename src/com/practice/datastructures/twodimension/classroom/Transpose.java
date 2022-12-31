package com.practice.datastructures.twodimension.classroom;

public class Transpose {

    private static void transposeSquare(int[][] A) {
        int N = A.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        System.out.println(A);

    }

    private static void transposeDifferentSize(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        for (int i = 0; i < M; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        System.out.println(A);
    }


    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int[][] A2 = {{1, 2, 3}, {6, 7, 8}, {11, 12, 13}};
//        transposeSquare(A2);
        int[][] A1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        transposeDifferentSize(A1);
    }

}
