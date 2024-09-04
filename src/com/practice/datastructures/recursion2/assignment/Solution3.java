package com.practice.datastructures.recursion2.assignment;

public class Solution3 {

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(sol.solve(83557));
    }

    int solve(int A) {

        int sum = sum(A);
        if (sum / 10 != 0) {
            sum = solve(sum);
        }

        while(A>=10){
            A = sum(A);
        }
        if (sum == 1) {
            return 1;
        }
        return 0;
    }

    int sum(int A) {
        if (A == 0) {
            return 0;
        }

        int num = A % 10;
        A = A / 10;
        return num + sum(A);
    }
}
