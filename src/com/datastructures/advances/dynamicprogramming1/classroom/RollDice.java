package com.datastructures.advances.dynamicprogramming1.classroom;

public class RollDice {

    int[] dp ;
    RollDice(int N){
        dp = new int[N+1];
    }

    int rollDiceSixSum(int N){

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        dp[4] = 8;
        dp[5] = 16;
        for (int i = 6; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4] + dp[i - 5] + dp[i - 6];
        }
        return dp[N];

    }
    int rollDiceSum(int N){
        int dp[] = new int[N+1];
        dp[0] = 1;
        for (int i = 1; i <= N; i++) {
            int s = 0;
            for (int j = 1; j <= 6 && j <= i; j++) {
                s = s + dp[i - j];
            }
            dp[i] = s;
        }
        return dp[N];
    }

    int rollDiceSumOptimised(int N){
        int dp[] = new int[7];
        dp[0] = 1;
        for (int i = 1; i <= N; i++) {
            int s = 0;
            for (int j = 1; j <= 6 && j <= i; j++) {
                s = s + dp[(i - j)%7];
            }
            dp[i%7] = s;
        }
        return dp[N%7];
    }

    public static void main(String[] args) {
        RollDice rollDice = new RollDice(8);
        System.out.println(rollDice.rollDiceSixSum(8));
        System.out.println(rollDice.rollDiceSum(8));
        System.out.println(rollDice.rollDiceSumOptimised(8));
    }

}
