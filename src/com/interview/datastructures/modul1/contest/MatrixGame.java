package com.interview.datastructures.modul1.contest;

import java.util.Scanner;

public class MatrixGame {


    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[][] A = new int[N][M];

        int K = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = K;
                K++;
            }
        }

        for (int q = 0; q < Q; q++) {
            // first Query swap two columns
            int t = sc.nextInt();
            //swap c1 , c2
            if (t == 1) {
                int c1 = sc.nextInt();
                c1 = c1 - 1;
                int c2 = sc.nextInt();
                c2 = c2 - 1;
                for (int i = 0; i < N; i++) {
                    for (int j = c1 ; j < N; j++) {
                        int temp = A[i][j];
                        A[i][j] = A[i][c2];
                        A[i][c2] = temp;
                    }
                }
            }

            if (t == 2) {
                int r1 = sc.nextInt();
                r1 = r1 - 1;
                int r2 = sc.nextInt();
                r2 = r2 - 1;
                for (int i = r1; i < r2; i++) {
                    for (int j = 0; j < N; j++) {
                        int temp = A[i][j];
                        A[i][j] = A[i][r1];
                        A[i][r1] = temp;
                    }
                }
            }

            // Bitwise OR
            if (t == 3) {
                int X1 = sc.nextInt();
                int Y1 = sc.nextInt();
                int X2 = sc.nextInt();
                int Y2 = sc.nextInt();
                int bitOp = A[X1 - 1][Y1 - 1] | A[X2 - 1][Y2 - 1];

                System.out.println(bitOp);
            }

            if (t == 4) {
                int X1 = sc.nextInt();
                int Y1 = sc.nextInt();
                int X2 = sc.nextInt();
                int Y2 = sc.nextInt();
                int bitAnd = A[X1 - 1][Y1 - 1] & A[X2 - 1][Y2 - 1];

                System.out.println(bitAnd);
            }

        }

    }
}
