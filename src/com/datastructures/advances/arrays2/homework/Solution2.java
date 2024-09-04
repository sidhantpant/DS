package com.datastructures.advances.arrays2.homework;

public class Solution2 {
    public int[][] generateMatrix(int A) {
        int[][] B = new int[A][A];
        int row = 0 ;
        int col = 0;
        int i = 1;
        int N = A;

        while(N > 1){

            for(int k = 1; k < N ; k++){
                B[row][col] = i;
                col++;
                i++;
            }

            for(int k =1 ; k < N ; k++){
                B[row][col] = i;
                row++;
                i++;
            }

            for(int k = 1; k < N ; k++){
                B[row][col] = i;
                col--;
                i++;
            }

            for(int k =1 ; k < N ; k++){
                B[row][col] = i;
                row--;
                i++;
            }

            N = N-2;
            row++;
            col++;
        }
        if(N == 1){
            B[row][col] = i ;
        }
        return B;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        solution2.generateMatrix(5);
    }
}
