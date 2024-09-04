package com.practice.datastructures.recursion.assignment;

public class Solution2 {

   static int findAthFibonacci(int A){
        if(A <=1){
            return A;
        }
        int ans = findAthFibonacci(A-1)+ findAthFibonacci(A-2);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findAthFibonacci(10));
    }
}
