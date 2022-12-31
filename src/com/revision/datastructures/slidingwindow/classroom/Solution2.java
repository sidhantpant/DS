package com.revision.datastructures.slidingwindow.classroom;

public class Solution2 {

    private static void printSpiralMatrix(int[][] A) {

        int N = A.length;
        int row = 0;
        int col = 0;
        while (N > 1) {

            for (int k = 0; k < N - 1; k++) {
                System.out.println(A[row][col]);
                col++;
            }
            for (int k = 0; k < N - 1; k++) {
                System.out.println(A[row][col]);
                row++;
            }
            for (int k = 0; k < N - 1; k++) {
                System.out.println(A[row][col]);
                col--;
            }
            for (int k = 0; k < N - 1; k++) {
                System.out.println(A[row][col]);
                row--;
            }
            N = N - 2;
            row++;
            col++;
        }
        if (N == 1) {
            System.out.println(A[row][col]);
        }

    }

    private static void printRectangularMatrix(int[][] A) {

        int N = A.length;
        int M = A[0].length;
        int row = 0;
        int col = 0;
        while (N >= 0) {

            for (int k = 0; k < M - 1; k++) {
                System.out.println(A[row][col]);
                col++;
            }
            for (int k = 0; k < N - 1; k++) {
                System.out.println(A[row][col]);
                row++;
            }
            for (int k = 0; k < M - 1; k++) {
                System.out.println(A[row][col]);
                col--;
            }
            for (int k = 0; k < N - 1; k++) {
                System.out.println(A[row][col]);
                row--;
            }
            N = N - 2;
            M = M - 2;
            row++;
            col++;
        }

    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
//        printSpiralMatrix(A);
        printRectangularMatrix(A);
    }

}
