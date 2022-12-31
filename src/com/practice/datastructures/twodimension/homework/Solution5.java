package com.practice.datastructures.twodimension.homework;

import java.util.ArrayList;
import java.util.List;

public class Solution5 {

    private static int[][] solve(int[][] A) {

        int row = A.length;
        int col = A[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (A[i][j] == 0) {
                    int k = 0;
                    while (k < col) {
                        A[i][k] = 0;
                        k++;
                    }
                }
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (A[j][i] == 0) {
                    int k = 0;
                    while (k < row) {
                        A[k][j] = 0;
                        k++;
                    }
                }
            }
        }
        return A;
    }

    private static int[][] solve2(int[][] A) {

        int row = A.length;
        int col = A[0].length;
        List<Integer> R = new ArrayList<>();
        List<Integer> C = new ArrayList<>();

        for(int i =0 ;i< row ;i++){
            for(int j=0 ; j < col ; j++){
                if(A[i][j] == 0){
                    R.add(i);
                    C.add(j);
                }
            }
        }

        for(int i=0 ; i < R.size() ; i++){
            for(int j = 0 ; j < col ;j++){
                int r = R.get(i);
                A[r][j] =0 ;
            }
        }

        for(int i=0 ; i < C.size() ; i++){
            for(int j = 0 ; j < row ;j++){
                int c = C.get(i);
                A[j][c] =0 ;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 0, 3, 4}, {5, 6, 7, 8}, {0, 10, 11, 12}};
        solve2(A);
    }

}
