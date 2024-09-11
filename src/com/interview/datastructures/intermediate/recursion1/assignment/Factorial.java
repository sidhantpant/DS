package com.interview.datastructures.intermediate.recursion1.assignment;

public class Factorial {

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.factorial(10));

    }

    public int factorial(int A) {
        if (A <= 1) {
            return 1;
        }

        return factorial(A - 1) * A;
    }
}
