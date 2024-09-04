package com.interview.datastructures.matrices.classroom;

public class TraingularMatrix {

    public void printUpperTriangularMatrix(int[][] A){
        int N = A.length;
        int M = A[0].length;
        for(int i = 0 ; i < N ; i++){
            for (int j = i+1; j < M; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public void printLowerTriangularMatrix(int[][] A){
        int N = A.length;
        int M = A[0].length;
        for(int i = 0 ; i < N ; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        TraingularMatrix tm = new TraingularMatrix();
        int[][] A = {{2,3,4,5},{6,7,8,9},{10,11,12,13},{14,15,16,17}};
        tm.printUpperTriangularMatrix(A);
        tm.printLowerTriangularMatrix(A);
    }

}
