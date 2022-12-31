package com.practice.datastructures.twodimension.classroom;

public class Solution {

    private static void printSum(int[][] A){
        int N = A.length;
        int M = A[0].length;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum = sum+A[i][j];
            }
            System.out.println(sum);
        }
    }

    private static void printDiagonals(int[][] A){
        int N = A.length;
        int M = A[0].length;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) {
                if(i==j){
                    sum = sum+A[i][j];
                }
            }
            System.out.println(sum);
        }
    }



    private static void transpose(int[][] A){
        int N = A.length;
        int M = A[0].length;
        System.out.println(A);
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < M; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        System.out.println(A);
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(A);
    }


}
