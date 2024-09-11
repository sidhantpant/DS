package com.interview.datastructures.intermediate.recursion2.assignment;

public class SumOfDigits1 {

    public static void main(String[] args) {

        SumOfDigits1 sod = new SumOfDigits1();
        System.out.println(sod.sumOfDigits(83557));
    }

    public int sumOfDigits(int A) {
        if (A == 0) {
            return 0;
        }
        int d = A % 10;
        return d + sumOfDigits(A / 10);
    }

}
