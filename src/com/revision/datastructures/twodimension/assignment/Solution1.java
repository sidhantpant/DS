package com.revision.datastructures.twodimension.assignment;

public class Solution1 {

    private static void printColumnSum(int[][] A){
        int N = A.length; // 2
        int M = A[0].length;// 5
        int[] columnSum = new int[M];
        for (int i = 0; i < M; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum = sum + A[j][i];
            }
            columnSum[i] = sum;
        }
        System.out.println(columnSum);
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4, 5}, {6, 7, 8, 9,10}};
        printColumnSum(A);
    }
}
