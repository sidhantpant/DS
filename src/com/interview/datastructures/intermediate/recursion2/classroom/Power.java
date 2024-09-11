package com.interview.datastructures.intermediate.recursion2.classroom;

public class Power {

    public static void main(String[] args) {
        Power p = new Power();
        System.out.println(p.pow(2,5));
    }

    public int pow(int A, int N) {
        if (N == 0) {
            return 1;
        }

        int temp = pow(A, N / 2);
        if (N % 2 == 0) {  //this is the main logic
            return temp * temp;
        } else {
            return temp * temp * A;
        }

    }

}
