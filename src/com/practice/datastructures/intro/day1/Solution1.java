package com.practice.datastructures.intro.day1;

public class Solution1 {

  /*  Given an integer A, you need to find the count of it's factors.
    Factor of a number is the number which divides it perfectly leaving no remainder.
    Example : 1, 2, 3, 6 are factors of 6
    Problem Constraints 1 <= A <= 109
    */


    public static int countFactors1(int A) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(A); i++) {

            if (A % i == 0) {
                if (i == A / i) {
                    count++;
                } else {
                    count = count + 2;
                }
            }
        }
        return count;
    }

    public static int countFactors2(int A) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(A); i++) {
            if (A % i == 0) {
                if (i * i == A) {
                    count = count + 1;
                }else{
                    count = count+2;
                }
            }
        }
        return count;
    }

    public static int countFactors3(int A) {
        int count = 0;
        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                if (i * i == A) {
                    count += 1;
                }else{
                    count = count+2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        System.out.println(countFactors2(13));
        System.out.println(countFactors3(7));
    }
}
