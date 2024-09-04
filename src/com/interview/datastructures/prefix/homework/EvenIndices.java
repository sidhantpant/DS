package com.interview.datastructures.prefix.homework;

public class EvenIndices {

    public int[] solve(int[] A,int[][] B){

        int N = A.length;
        int[] PS = new int[N+1];
        PS[0] = 0;
        // Create the PS
        for(int i = 1 ; i < N+1 ;i++){
            // here check if ther array is even or odd
            if(A[i-1]%2 == 0){
                PS[i] = PS[i-1] + 1;
            }else{
                // same as previous prefix
                PS[i] = PS[i-1];
            }
        }

        int[] range = new int[N];
        int M = B[0].length;
        for(int i = 0 ; i< M; i++ ){
            int start = B[i][0];
            int end = B[i][1];
            int sum = PS[end+1] - PS[start];
            range[i] = sum;
        }
        return range;
    }


}
