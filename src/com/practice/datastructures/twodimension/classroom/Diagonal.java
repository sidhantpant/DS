package com.practice.datastructures.twodimension.classroom;

import java.util.ArrayList;

public class Diagonal {

    private static void printLeftDiagonal(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    System.out.println(A[i][j]);
                }
            }
        }
    }

    private static void printLeftDiagonalOptimized(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i == j) {
                    System.out.println(A[i][j]);
                }
            }
        }
    }

    private static void printRightDiagonal(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < M; j++) {
                if (i + j == N - 1) {
                    System.out.println(A[i][j]);
                }
            }
        }
    }

    private static void printRightDiagonal1(int[][] A, int N) {
//        int N = A.length;
        int i = 0;
        int j = N - 1;
        while (i <= N - 1) {
            System.out.print(A[i][j]);
            i++;
            j--;
        }
    }

    private static int[][] diagonal(int[][] A) {

        int N = A.length;
        int[][] newarr = new int[2 * N - 1][N];   //as per question

        for (int i = 0; i < N; i++) {                // 3
            int p = 0;
            for (int j = i; j >= 0; j--) {
                newarr[i][p] = A[p][j];
                p++;
            }
        }

        for (int i = 1; i < N; i++) {
            int f = i;
            for (int j = N - 1; j >= i; j--) {         //2    N-1
                newarr[N - 1 + i][N - 1 - j] = A[f][j];

                f++;
            }
        }
        return newarr;
    }


    private static void antiDiagonal(int[][] A) {
        int N = A.length;
        int[][] T = new int[2 * N - 1][N];
        int L = 2 * N - 1;
        for (int k = 0; k < L; k++) {
            int i = 0;
            int j = k - 1;
            if (k >= N) {
                T[k - 1][i] = A[i][j];
            }
            while (i <= k - 1) {
                T[k - 1][i] = A[i][j];
                i++;
                j--;
            }
            System.out.println(T);
        }
    }

    public static void main(String[] args) {
        int[][] A = {{4, 3, 1, 7}, {6, 2, 3, 4}, {5, 3, 2, 7}, {1, 2, 3, 4}};
        int[][] A1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        printRightDiagonal(A);
//        printRightDiagonal1(A);
        diagonal(A1);
    }

}
