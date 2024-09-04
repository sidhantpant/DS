package com.datastructures.advances.dynamicprogramming1.classroom;

public class Stair1 {

    int[] dp ;
    int N;
    Stair1(int N){
        this.N = N;
        this.dp = new int[N+1];
    }
    int noOfWays(){
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2 ; i <= N ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[N];
    }

    public static void main(String[] args) {
        Stair1 stair1 = new Stair1(5);
        System.out.println(stair1.noOfWays());
        // 1 1 2 3 5 8 13
    }

}
