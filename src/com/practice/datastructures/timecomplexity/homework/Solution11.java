package com.practice.datastructures.timecomplexity.homework;

public class Solution11 {

    private static void solve(int N) {

        for (int i = 1, j = 1; j <= N; i++) {
            System.out.println("i "+i +", j "+ j);
            if (i % N == 0) {
                j++;
            }
        }
    }



    public static void main(String[] args) {
            solve(5);
    }

}
