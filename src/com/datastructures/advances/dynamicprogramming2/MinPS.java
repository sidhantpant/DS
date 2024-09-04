package com.datastructures.advances.dynamicprogramming2;

public class MinPS {

    int minPS(int N){
        int[] dp = new int[N+1]; // dp state
        dp[0] = 0;
        for (int i = 1; i <= N; i++) {
            int ans = i;
            for (int j = 1; j*j <= i ; j++) {
                ans = Math.min(ans,dp[i-j*j]+1);
            }
            dp[i] = ans;
        }
        return dp[N];
    }

    public static void main(String[] args) {
        MinPS min = new MinPS();
        System.out.println(min.minPS(14));
    }

}
