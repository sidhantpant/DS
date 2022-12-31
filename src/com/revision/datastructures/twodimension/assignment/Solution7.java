package com.revision.datastructures.twodimension.assignment;

public class Solution7 {

    private static int[][] rotate90Degree(int[][] A ){
        int N = A.length;
        int M = A[0].length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j <N/2; j++) {
                int temp = A[i][j];
                 A[i][j] = A[i][N-1-j];
                 A[i][N-1-j] = temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A = {{1,2},{3,4}};
        rotate90Degree(A);
    }

}
