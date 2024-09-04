package com.datastructures.advances.dynamicprogramming1.assignment;

import java.lang.*;
import java.util.*;

public class Solution2 {
    static int[] dp ;
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibMemoization(n));
    }

    static int fibMemoization(int A){

        Arrays.fill(dp,-1);
        dp = new int[A+1];
        return fibMemoization1(A);
    }

    static int fibMemoization1(int A){

        if(A <= 1){
            dp[A] = A;
            return A;
        }

        if(dp[A] == -1){
            dp[A] = fibMemoization1(A-1) + fibMemoization1(A-2);
        }
        return dp[A];
    }


    // static int fibTabulation(int A){

    //     int[] dp = new int[A+1];
    //     dp[0] = 0;
    //     dp[1] = 1;
    //     for(int i = 2  ; i <= A; i++){
    //         dp[i] = dp[i-1]+ dp[i-2];
    //     }
    //     return dp[A];
    // }
}
