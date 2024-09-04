package com.practice.datastructures.recursion.assignment;

public class Solution3 {

    static int fact(int A){
        if(A==0){
            return 1;
        }
        return fact(A-1)*A;
    }

    public static void main(String[] args) {
        System.out.println(fact(10));
    }
}
