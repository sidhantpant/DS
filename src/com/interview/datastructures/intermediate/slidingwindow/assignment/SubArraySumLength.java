package com.interview.datastructures.intermediate.slidingwindow.assignment;

public class SubArraySumLength {

    public boolean subArrraySumLength(int[] A, int B, int C){

        int N = A.length;
        // Prepare the first window of size B
        int sum = 0 ;
        // prepare the first sliding window from 0 to K-1
        for(int i = 0 ; i < B ; i++){
            sum = sum + A[i];
        }
        if(sum == C){
            return true;
        }

        int s = 1;
        int e = B;

        while(e < N){
            sum = sum -A[s-1] + A[e];
            if(sum == C){
                return true;
            }
            s++;
            e++;
        }
        return false;
    }

}
