package com.practice.datastructures.intro.day1;


public class Solution3 {

    /* Given a number A. Return square root of the number if it
        is perfect square otherwise return -1.
        Problem Constraints
        1 <= A <= 108
     */

    public static int perfectSquare(int A) {

        for (int i = 0; i <= A; i++) {
            if (i * i == A) {
                return i;
            }
        }
        return -1;
    }

    static int optimizedPerfectSquare(int A) {
        for (int i = 1; i < 10000; i++) {
            if (i * i == A) {
                return i;
            }
        }
        return -1;
    }

    public static int perfectBinarySquare(int A) {

        long start = 1;
        long end = A;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (mid * mid == A) {
                return (int) mid;
            } else if (mid * mid > A) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
//        System.out.println(perfectSquare(84630800));
        System.out.println(perfectBinarySquare(84630800));
    }
}
