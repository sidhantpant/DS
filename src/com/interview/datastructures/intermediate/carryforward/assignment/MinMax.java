package com.interview.datastructures.intermediate.carryforward.assignment;

public class MinMax {

    public void findMinMax(int[] A){

        int N = A.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < N ; i++){
            min = A[i];
            for(int j = i+1 ; j < N ; j++){

                if(A[j] > A[i]){
                    min = A[i];
                    max = A[j];
                }else{
                    min = A[j];
                    max = A[i];
                }



            }
        }
        // 3 1 6 9 2
        // 1
        //min max count(j-i)
        // 1  9    2
        // 1  9    2
        // 1  6    1
    }


}
