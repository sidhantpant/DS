package com.revision.datastructures.twodimension.assignment;

public class Solution4 {

    private static int minorBased(int[][] A) {
        int N = A.length;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i + j == N-1 ) {
                    sum = sum + A[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] A = {{1,-2,-3},{-4,5,-6},{-7,-8,-9}};
        int[][] A1 = {{3,2},{2,3}};
//        minorBased(A);
        minorBased(A1);
    }
}
