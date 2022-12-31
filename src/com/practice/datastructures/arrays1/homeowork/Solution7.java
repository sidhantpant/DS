package com.practice.datastructures.arrays1.homeowork;

public class Solution7 {

        public int solve(int[] A) {
            int first_Max = A[0];
            int second_Max = Integer.MIN_VALUE;
            int firstMaxIndex = -1;
            int N = A.length;
            if(A.length == 1){
                return -1;
            }
            for(int i=1 ; i< N ; i++){
                if(A[i] > first_Max){
                    second_Max = first_Max;
                    first_Max = A[i];
                    firstMaxIndex = i;
                }else if( A[i] >= second_Max ){
                    second_Max = A[i];
                }
            }

            // for(int i=0 ; i< N ; i++){
            //     if(i!=firstMaxIndex && A[i] > second_Max){
            //        second_Max = A[i];
            //     }
            // }
            return second_Max;
    }

}
