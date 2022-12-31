package com.practice.datastructures.bitmanipulation2.homework;

public class Solution3 {

    private static int solve(int A) {
        int count = 0;
        while (A != 0) {

            if ((A & 1) == 1) {
                count++;
            }
            A = A >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solve(100));
    }
}
