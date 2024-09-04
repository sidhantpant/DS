package com.datastructures.advances.dynamicprogramming2;

public class PartyPairs {

    int[] dp ;
    int N ;
    PartyPairs(int N){
        this.dp = new int[N+1];
        this.N = N;
    }
    int partyPairs(){
        dp[0]= 1;
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            // dp expression dp[5] = dp[4] + 4*dp[3]
            dp[i] = dp[i-1] + (i-1)*dp[i-2];
        }
        return dp[N];
    }
}
