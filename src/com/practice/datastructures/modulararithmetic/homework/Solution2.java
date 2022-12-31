package com.practice.datastructures.modulararithmetic.homework;

public class Solution2 {

    private static int solve(String A) {

        int N = A.length();

        if (N == 0) {
            return 1;
        }

        if (N == 1) {
            if ((A.charAt(0) - '0') % 8 == 0) {
                return 1;
            }else {
                return 0;
            }
        }

        if (N == 2) {
            if (((A.charAt(N - 2) - '0') * 10 + (A.charAt(N - 1) - '0')) % 8 == 0) {
                return 1;
            }else{
                return 0;
            }
        }

        int last = A.charAt(N - 1) - '0';
        int secondLast = A.charAt(N - 2) - '0';
        int thirdLast = A.charAt(N - 3) - '0';

        if ((thirdLast * 100 + secondLast * 10 + last) % 8 == 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solve("16800"));
    }
}
