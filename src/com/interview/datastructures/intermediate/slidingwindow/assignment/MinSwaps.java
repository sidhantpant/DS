package com.interview.datastructures.intermediate.slidingwindow.assignment;

public class MinSwaps {

    public int minSwaps(int[] A , int B){
        int N = A.length;
        int countSize = 0;
        // check for the total elements  <=B
        for(int i = 0 ; i < N ; i++ ){
            if(A[i] <= B){
                countSize++;
            }
        }

        int greaterElem = 0;
        //check in the first sliding window
        for (int i = 0; i < countSize; i++) {
            //check elements greater than countsize
            if(A[i] > B){
                greaterElem++;
            }
        }

        return greaterElem;
    }
}
