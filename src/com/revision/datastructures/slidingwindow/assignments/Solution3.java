package com.revision.datastructures.slidingwindow.assignments;

public class Solution3 {

    private static int[][] addSpiralMatrix(int N) {

        int[][] A = new int[N][N];
        if(N==0){
            return A;
        }
        int row = 0;
        int col = 0;
        int B = 0;
        while (N >= 0) {
            if (N == 1) {
                B++;
                A[row][col] = B;
            }
            for (int k = 1; k < N; k++) {
                B++;
                A[row][col] = B;
                col++;
            }
            for (int k = 1; k < N; k++) {
                B++;
                A[row][col] = B;
                row++;
            }
            for (int k = 1; k < N; k++) {
                B++;
                A[row][col] = B;
                col--;
            }
            for (int k = 1; k < N; k++) {
                B++;
                A[row][col] = B;
                row--;
            }
            N = N - 2;
            row++;
            col++;
        }
        return A;
    }

    public static void main(String[] args) {
        int A = 5;
        addSpiralMatrix(1);

    }


}
