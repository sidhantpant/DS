package com.practice.datastructures.slidingwindow.assignment;

public class Solution3 {




    public int[][] generateMatrix(int A) {

        int num = A;

        //create a 2D matrix of size AxA
        int[][] input_mat = new int[num][num];

        int row = input_mat.length;
        int col = input_mat[0].length;

        int start_row = 0;
        int end_row = row - 1;

        int start_column = 0;
        int end_column = col - 1;

        //To load elements till AXA
        int var = 1;

        // Condition to when to stop
        while (start_row <= end_row && start_column <= end_column) {
            // loading elements from left to right -------------->
            for (int i = start_column; i <= end_column; i++) {
                input_mat[start_row][i] = var++;
            }
            start_row++; // because not repeat the same column number it has printed in the above for loop

            // to print from columns wise down  -
            //                                  -
            //                                  -
            //                                  top to bottom column
            for (int j = start_row; j <= end_row; j++) {
                input_mat[j][end_column] = var++;
            }
            end_column--;

            // to print <--------------  right to left
            if (end_row >= start_row) {
                for (int k = end_column; k >= start_column; k--) {
                    input_mat[end_row][k] = var++;
                }

            }
            end_row--;

            // to print upwards
            if (end_column >= start_column) {
                for (int l = end_row; l >= start_row; l--) {
                    input_mat[l][start_column] = var++;
                }

            }
            start_column++;
        }
        return input_mat;
    }


}
