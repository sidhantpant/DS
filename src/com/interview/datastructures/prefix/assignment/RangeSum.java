package com.interview.datastructures.prefix.assignment;

public class RangeSum {

    public int[] rangeSum( int[] A,int[][] B){

        int N = A.length;
        int[] PS = new int[N+1];

        for(int i = 1 ; i < N+1 ; i++){
            PS[i] = PS[i-1] + A[i-1];
        }

        int rows = B[0].length;
        int[] range = new int[rows];
        for (int i = 0; i < rows ; i++) {
            int start = B[i][0];
            int end = B[1][i];
            int rangeSum = PS[end+1] - PS[start];
            range[i] = rangeSum;
        }
        return range;

    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{0,3},{1,2}};
        RangeSum rangeSum = new RangeSum();
        rangeSum.rangeSum(A,B);
    }

}
