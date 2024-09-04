package com.interview.datastructures.matrices.classroom;


public class RotateMatrix90 {

    public int[][] rotateMatrix(int[][] A){

        int R = A.length;
        // transpose the input matrix
        for (int i = 0; i < R; i++) {
            for(int j = i+1 ; j < R ;j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        //reverse each row of a transposed matrix

        for (int i =0 ; i < R ; i++){
            reverse(A[i]);
        }
        return A;
    }

    public void reverse(int[] row){

        int R = row.length;
        int s = 0;
        int e = R-1;
        while(s < e){
            int temp = row[s];
            row[s] = row[e];
            row[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {

        int[][] A = {{2,3,4,5},{6,7,8,9},{10,11,12,13},{14,15,16,17}};
        RotateMatrix90 rotate = new RotateMatrix90();
        rotate.rotateMatrix(A);
    }


}
