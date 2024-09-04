package com.practice.datastructures.recursion.classroom;

public class Factorial {

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
