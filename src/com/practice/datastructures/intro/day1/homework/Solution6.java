package com.practice.datastructures.intro.day1.homework;

public class Solution6 {

    private static int perfectNumberOptimize(int A) {
        if (A == 1) {
            return 0;
        }
        int sum = 1;
        for (int i = 2; i * i <= A; i++) {
            if (A % i == 0) {
                sum = sum + i;
                int j = A / i;
                if (i == j) {
                    sum = sum + j;
                }
            }
        }
        if (sum == A) {
            return 1;
        }
        return 0;
    }

    public static int perfectNumber(int A) {
        int sum = 0;
        for (int i = 1; i < A; i++) {
            if (A % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == A) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(perfectNumber(10));
//        System.out.println(perfectNumberOptimize(1));
    }
}
