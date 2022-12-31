package com.revision.datastructures.twodimension.assignment;

public class Solution2 {

    private static void printRowSum(int[][] A){
        int N= A.length;
        int M = A[0].length;
        int[] k = new int[N];
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum = sum + A[i][j];
            }
            k[i] = sum;
        }
        System.out.println(k);
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4, 5}, {6, 7, 8, 9,10}};
        printRowSum(A);
    }
}
