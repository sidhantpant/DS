package com.practice.datastructures.slidingwindow.classroom.assignment;

public class Solution1 {

    private static int solve(int[] A, int B, int C) {
        int N = A.length;
        int sum = 0 ;
        if( N == 0){
            return 0;
        }
        for(int i=0 ; i< B ;i++){
            sum = sum + A[i];
        }
        if(sum == C){
            return 1;
        }

        int start = 1;
        int end = B;
        while(end < N){
            sum = sum - A[start-1] + A[end];
            if(sum == C){
                return 1;
            }
            start++;
            end++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = { 8, 7, 7, 6, 6, 3, 1, 5, 7};
        int[] A1 = { };
        int t = solve(A1,2,5);
        System.out.println(t);
    }
}
