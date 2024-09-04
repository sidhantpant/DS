package com.interview.datastructures.matrices.assignment;

public class ColumnWiseSum {

    public int[] printSumColumnWise(int[][] A){

        int R = A.length;
        int C = A[0].length;
        int[] K = new int[C];

        for(int j = 0 ; j < C ;j++){
            int sum = 0 ;
            for(int i = 0 ; i < R ; i++){
                sum = sum + A[i][j];
            }
            K[j] = sum;
        }
        return K;
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        ColumnWiseSum cw = new ColumnWiseSum();
        cw.printSumColumnWise(A);
    }
}
