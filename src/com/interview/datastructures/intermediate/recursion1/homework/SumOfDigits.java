package com.interview.datastructures.intermediate.recursion1.homework;

public class SumOfDigits {

    public static void main(String[] args) {
        SumOfDigits sod = new SumOfDigits();
        System.out.println(sod.sumOfDigits(12345));
    }

    public int sumOfDigits(int A) {
        if (A == 0) {
            return 0;
        }
        int d = A % 10;
        return d + sumOfDigits(A / 10);
    }

}
