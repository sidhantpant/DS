package com.practice.datastructures.recursion.homework;

public class Solution1 {

    static int solve(int A) {
        if(A == 0 ){
            return A;
        }
        int d = A % 10;
        A = A / 10;
        return d + solve(A);

    }

    public static void main(String[] args) {
        System.out.println(solve(425));
    }
}
