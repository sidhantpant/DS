package com.datastructures.advances.dynamicprogramming1.classroom;

public class FibDynamic {


    int fibRecursion(int N){

        if(N <= 1){
            return N;
        }

       return fibRecursion(N-1) + fibRecursion(N-2);
    }
    int fibDynamic(int N , int[] dp){

        if(N <= 1){
            dp[N] = N;
        }

        if(dp[N] == -1){
            dp[N] = fibDynamic(N-1,dp) + fibDynamic(N-2,dp);
            return dp[N];
        }
        return dp[N];
    }

    int fibIterative(int N){ // bottom up dp
        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < N+1; i++) {
          dp[i] = dp[i-1] +dp[i-2];
        }
        return dp[N];
    }

    int fibIterativeSpaceOptimisation(int N){
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i < N; i++) {
            c = a+b;
            a = b;
            b =c;
        }
        return c;
    }
    public static void main(String[] args) {
        int N = 10000000;
        int[] dp = new int[N+1];
        for(int i=0 ; i< N+1 ;i++){
            dp[i] = -1;
        }
        FibDynamic fib = new FibDynamic();
       // System.out.println(fib.fibRecursion(60));
          System.out.println(fib.fibIterative(N));
         // System.out.println(fib.fibDynamic(N, dp));
    }

}
