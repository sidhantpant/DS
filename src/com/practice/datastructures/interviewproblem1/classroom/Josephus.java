package com.practice.datastructures.interviewproblem1.classroom;

public class Josephus {

    public int solve(int A) {
        int x = A;
        int i = 0;
        while(x != 0 ){
            i++;
            x = x / 2;
        }
        int B = A - (int)Math.pow(2,i-1);
        return 1+ 2*B;
    }

    public static void main(String[] args) {
        Josephus jos = new Josephus();
        jos.solve(12);
    }
}
