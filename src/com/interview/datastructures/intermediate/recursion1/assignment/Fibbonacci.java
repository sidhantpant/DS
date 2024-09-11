package com.interview.datastructures.intermediate.recursion1.assignment;

public class Fibbonacci {

    public int findAthFibonacci(int A) {

        if (A <= 1) {
            return A;
        }
        return findAthFibonacci(A - 1) + findAthFibonacci(A - 2);
    }

    public static void main(String[] args) {
        Fibbonacci fb = new Fibbonacci();
        System.out.println(fb.findAthFibonacci(54));
    }


}
