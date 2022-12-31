package com.practice.datastructures.twodimension.classroom;

public class ColumnWise {

    private static void itereateColumns(int[][] A){
        int row = A.length;
        int col = A[0].length;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println(A[j][i]);
            }
        }
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        itereateColumns(A);
    }
}
