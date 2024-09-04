package com.datastructures.advances.dynamicprogramming1.assignment;

import com.datastructures.advances.permutations.classroom.Solution;

import java.io.InputStream;
import java.util.Scanner;

public class Solution1 {

    int climbStairs(int A){
        int[] dp = new int[A+1];
        return solveDp(A,dp);

    }

    private int solveDp(int A, int[] dp) {
        if( A <= 1 ){
           dp[A] = A;
        }

        if(dp[A] == -1){
            dp[A] = solveDp(A-1,dp) + solveDp(A-2,dp);
        }
        return dp[A];
    }

    private int climbStairsTabulation(int A){

        int a = 0;
        int b = 1;
        int c  ;
        for (int i = 2; i <= A ; i++) {
            c = a+b;
            a = b;
            b = c;
        }
        return b;
    }
    // 1 1 2 3 5 8

    public static void main(String[] args) {
        Solution1 solution1= new Solution1();
        Scanner sc = new Scanner(System.in);
        System.out.println(solution1.climbStairsTabulation(4));
    }

}
