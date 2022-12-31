package com.revision.datastructures.twodimension.assignment;

public class Solution5 {

    private static int[][] antiDiagonal(int[][] A){

        int N = A.length;
        int[][] newarr = new int[2 * N - 1][N];
        for (int i = 0; i < N; i++) {
            int p = 0;
            for (int j = i; j >= 0 ; j--) {
                newarr[i][p] = A[p][j];
                p++;
            }
        }

        for (int i = 1; i < N; i++) {
            int f = i;
            for (int j = N-1; j >=1 ; j--) {
                newarr[N-i+1][N-1-j]= A[f][j];
            }
        }
        return newarr;
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        antiDiagonal(A);

    }
}
