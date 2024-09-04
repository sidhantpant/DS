package com.datastructures.advances.dynamicprogramming1.classroom;

public class Fib1 {

    int N;
    int[] dp;

    Fib1(int N) {
        this.N = N;
        this.dp = new int[N + 1];
    }
    int fibonacchiRecur(int N) {

        if (N <= 1) {
            return N;
        }
        return fibonacchiRecur(N - 1) + fibonacchiRecur(N - 2);

    }

    int fibRecMemoization(int N) {
        if (N <= 1) {
            return N;
        }
        if (dp[N] == -1) {
            dp[N] = fibRecMemoization(N - 1) + fibRecMemoization(N - 2);
        }
        return dp[N];
    }


    int fibIterative(int N){
        dp[0] = 0;dp[1] = 1;
        for(int i = 2; i <= N ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[N];
    }

    int fibIterativeSpaceOptimised(int N){ // TC : O(N) , SC : O(1)
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 2; i <= N ; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;

    }
    public static void main(String[] args) {
        Fib1 fib1 = new Fib1(3);
        System.out.println(fib1.fibonacchiRecur(1));
        fib1.fibRecMemoization(4);
    }

}
