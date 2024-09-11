package com.practice.datastructures.sorting.homework;

import java.util.Arrays;

public class Solution2 {

    private static int solve(int[] A) {
        Arrays.sort(A);
        reverse(A);
        int N = A.length;
        int ans = 0 ;
        System.out.println(A);
        for(int i=0;i< N ;i++){
            ans = ans + A[i]*(i+1);
        }
        return ans;
    }

   static void reverse(int[] A ){
        int N = A.length;
        for(int i=0;i< N/2;i++){
            int temp = A[i];
            A[i] = A[N-1-i];
            A[N-1-i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] A = { 8, 0, 10 };
        System.out.println(solve(A));
    }
}
