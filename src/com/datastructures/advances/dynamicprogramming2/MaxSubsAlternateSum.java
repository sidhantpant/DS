package com.datastructures.advances.dynamicprogramming2;

public class MaxSubsAlternateSum {

    int N ;
    int[] dp;
    MaxSubsAlternateSum(int N){
        this.N = N;
        this.dp = new int[N];
    }
    int maxSubSumWithoutAdjacent(int[] arr){

        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for(int i = 2 ; i < N ; i++){
            dp[i]  = Math.max(dp[i-1] , dp[i-2]+arr[i]);
        }
        return dp[N-1];
    }

    public static void main(String[] args) {
        int[] arr = {9,4,13,24};
        MaxSubsAlternateSum mss = new MaxSubsAlternateSum(4);
        System.out.println(mss.maxSubSumWithoutAdjacent(arr));
    }
}
