package com.interview.datastructures.intermediate.recursion2.assignment;

public class MagicNumber {

    public static void main(String[] args) {
        MagicNumber mn = new MagicNumber();
        System.out.println(mn.magicNumber(83557));
    }

    public int magicNumber(int A) {
        if (A < 10) {
            return A == 1 ? 1 : 0;
        }
        int y = sumOfDigit(A);
        System.out.println(y);
        return magicNumber(y);
    }

    public int sumOfDigit(int A) {
        if (A == 0) {
            return A;
        }
        return A % 10 + sumOfDigit(A / 10);
    }
}
