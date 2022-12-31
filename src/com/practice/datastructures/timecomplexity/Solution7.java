package com.practice.datastructures.timecomplexity;

public class Solution7 {


    private static void solve(int N) {
        int i = 0;
        while (i * i <= N) {
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k <= N; k++) {
                    System.out.println("i=" + i + " j=" + j + " k=" + k);
                }
            }
            Math.max(i,i);
            i++;
        }
    }

    public static void main(String[] args) {
        solve(10);
    }
}
