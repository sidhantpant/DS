package com.datastructures.advances.backtracking1.classroom;

public class SubsetSum {

    int subsetSum(int[] arr, int N , int K, int i, int sum){

        if(i == N){
            if(sum == K){
                return 1;
            }else{
                return 0;
            }
        }
        int c = 0;
        sum = sum +arr[i];
        c = c + subsetSum(arr, N , K, i+1, sum);

        sum = sum - arr[i];
        c = c+ subsetSum(arr,N,K ,i+1,sum);
        return c;
    }
}
