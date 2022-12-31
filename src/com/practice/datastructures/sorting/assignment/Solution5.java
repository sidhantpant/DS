package com.practice.datastructures.sorting.assignment;

public class Solution5 {

    private static int[] sortColors(int[] A) {

        int N = A.length ;
        for(int i = 0 ; i < N ;i++){
            for(int j = 0 ;j < N-1-i ;j++){
                if(A[j] > A[j+1]){
                    swap(A,j,j+1);
                }
            }
        }
        return A;
    }

    public static void swap(int[] A ,int i,int j){
        int temp = A[i];
        A[i]= A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] A = {2,1,3,4,8};
        sortColors(A);
    }
}
