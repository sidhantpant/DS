package com.interview.datastructures.matrices.classroom;

public class RightDiagonal {

    public void printLeftDiagonal(int[][] A){

        int N = A.length;
        for (int i = 0; i < N; i++) {
            System.out.println(A[i][i]);
        }
    }

    public void printRightDiagonal(int[][] A){
        int N = A.length;

        int s = 0 ;
        int e = N-1;
        while( s < N && e >= 0 ){
            System.out.println(A[s][e]);
            s++;
            e--;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(A[i][N-i-1]);
        }
    }

    public static void main(String[] args) {
        RightDiagonal rightDiagonal = new RightDiagonal();
        int[][] A = {{2,3,4,5},{6,7,8,9},{10,11,12,13},{14,15,16,17}};
        rightDiagonal.printLeftDiagonal(A);
//        rightDiagonal.printRightDiagonal(A);
    }

}
