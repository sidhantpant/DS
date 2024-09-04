package com.interview.datastructures.palindrom.assignment;

public class Factorial {

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.factorial(0));

    }

    public int factorial(int A) {
        if (A <= 1) {
            return 1;
        }

        return factorial(A - 1) * A;
    }
}
