package com.practice.datastructures.intro.day1;

public class Solution2 {

   /* Given an Integer A. Return 1 if A is prime and return 0 if not.
      Problem Constraints 1 <= A <= 1012*/

    public static int prime(long A) {

        int count = 0;
        for (int i = 1; i * i <= A; i++) {

            if (A % i == 0) {
                if (i == A / i) {
                    count++;
                } else {
                    count = count + 2;
                }
            }
        }
        System.out.println("count"+count);
        if (count == 2) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int primeOptimize(Long A) {
        if (A == 1) return 0;
        for (long i = 2; i * i <= A; i++) {
            if (A % i == 0) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(prime(1));
    }


}
