package com.practice.datastructures.prefix.homework;

public class Solution6 {

    private static int[] solve(int[] A) {
        int N = A.length;
        int[] B = new int[N];
        int fact = 1  ;
        for(int i=0 ; i< N ;i++){
            fact = fact * A[i];
        }
        for(int i=0 ; i< N ;i++){
            B[i] = fact /  A[i];
        }
        return B;
    }

    public static void main(String[] args) {
      int[] A = { 1, 2, 3, 4, 5 };
      solve(A);
    }
}
