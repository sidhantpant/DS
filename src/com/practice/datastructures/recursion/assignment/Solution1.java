package com.practice.datastructures.recursion.assignment;

public class Solution1 {

    private static int solve(int A) {
        while (A >= 10){
            A = sum(A);
        }
        if(A == 1){
            return 1;
        }
        return 0;
    }

    private static int sum(int A) {
        if( A == 0){
            return 0;
        }
        int num = A % 10;
        return num + sum(A/10);
    }

    public static void main(String[] args) {
        System.out.println(solve(1291));
    }
}
