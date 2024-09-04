package com.datastructures.advances.arrays2.classroom;

import com.datastructures.advances.tries1.classroom.Node;

public class SumMatrix {

    boolean KPresentInSortedMatrix(int[][] A,int K){
        int N = A.length;
        int i = 0 ;
        int j = N-1;

        while(i < N  &&  j > 0){
            if(A[i][j] == K){
                return true;
            }
            if(A[i][j] < K){
                i=i+1;
            }
            else if(A[i][j] > K){
                j = j-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        SumMatrix matrix = new SumMatrix();
        System.out.println(matrix.KPresentInSortedMatrix(A,2));
    }
}
