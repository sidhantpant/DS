package com.practice.datastructures.bitmanipulation.homework;

public class Solution {
    public long solve(int A, int[] B) {

        long count = 0;
        long zeros = 0 ;
        for(int i = 0 ;i < A ;i++){
            if(B[i] == 0){
                zeros++;
            }
            if(B[i] ==1){
                count += (zeros *(zeros+1))/2;
                zeros = 0;
            } 
        }
        if(zeros > 0){
            count += (zeros *(zeros+1))/2;
        }
        
        return A - count;


        // long count =0 ;
        // for (int i = 0; i < A; i++) {
        //     int ans = 0;
        //     for (int j = i; j < A; j++) {
        //         ans = ans | B[j];
        //         if(ans == 1){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }

    public static void main(String[] args) {
        int[] B = {1,0,1};
        Solution sol = new Solution();
        sol.solve(3,B);
    }
}
