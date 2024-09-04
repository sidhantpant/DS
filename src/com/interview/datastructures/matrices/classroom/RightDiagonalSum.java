package com.interview.datastructures.matrices.classroom;

public class RightDiagonalSum {

    public int printRightDiagonalSum(int[][] A) {
        int N = A.length;
        int s = 0;
        int e = N - 1;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + A[s][e];
            s++;
            e--;
        }
        return sum;
    }

    public int printRightDiagonalSumBetter(int[][] A){
        int N = A.length;
        int sum = 0 ;
        for(int i = 0 ; i < N ; i++){
            sum = sum + A[i][N-i-1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] A = {{1, -2, -3}, {-4, 5, -6}, {-7, -8, 9}};
        RightDiagonalSum rds = new RightDiagonalSum();
        rds.printRightDiagonalSum(A);
        System.out.println(rds.printRightDiagonalSumBetter(A));
    }

}
