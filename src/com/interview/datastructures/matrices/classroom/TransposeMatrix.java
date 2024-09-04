package com.interview.datastructures.matrices.classroom;

public class TransposeMatrix {

    public int[][] transpose(int[][] A){
        int R = A.length;

        for (int i = 0; i < R; i++) {
            for (int j = i+1; j < R ; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A = {{2,3,4,5},{6,7,8,9},{10,11,12,13},{14,15,16,17}};
        TransposeMatrix tm = new TransposeMatrix();
      //  tm.transpose(A);
    }
}
