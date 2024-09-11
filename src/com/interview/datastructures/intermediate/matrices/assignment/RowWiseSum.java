package com.interview.datastructures.intermediate.matrices.assignment;

public class RowWiseSum {

    public int[] printSumRowWise(int[][] A) {

        int R = A.length;
        int C = A[0].length;
        int[] K = new int[R];

        for (int i = 0; i < R; i++) {
            int sum = 0;
            for (int j = 0; j < C; j++) {
                sum = sum + A[i][j];
            }
            K[i] = sum;
        }
        return K;
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        RowWiseSum rws = new RowWiseSum();
        rws.printSumRowWise(A);
    }
}
