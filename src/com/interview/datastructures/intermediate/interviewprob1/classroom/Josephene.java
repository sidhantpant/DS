package com.interview.datastructures.intermediate.interviewprob1.classroom;

public class Josephene {

    public int solve(int A) {
        int i = 0;
        int d = A / 2;
        while (d != 0) {
            i++;
            d = d / 2;
        }
        int B = A - (int) Math.pow(2, i );
        return 2 * B + 1;
    }

    public static void main(String[] args) {
        Josephene jo = new Josephene();
        System.out.println(jo.solve(2));
    }
}
