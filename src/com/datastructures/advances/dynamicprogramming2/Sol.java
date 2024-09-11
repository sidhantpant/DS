package com.datastructures.advances.dynamicprogramming2;

public class Sol {

    public int solve(int[] A) {
        int N = A.length;
        if(N==0) return 0;
        if(N == 1) return A[0];
        if(N == 2) return Math.max(A[0],A[1]);

        int[] dp = new int[N];
        dp[0] = A[0];
        dp[1] = Math.max(dp[0],dp[1]);
        for(int i =2 ; i < N ; i++){
            dp[i] = Math.max(dp[i-1],A[i]+dp[i-2]);

        }
        return dp[N-1];
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        int[] A = {5,20,10};
        System.out.println(s.solve(A));
    }
}
