package com.interview.datastructures.bitmanipulation2.assignment;

public class CheckBit {

    public int checkBit(int A,int B){

        //right shift the number A ,B times . A/2^B and for LSB position i.e 0 position do the & with 1.
        //If the bit is 0 the ans =0 or ans = 1;
//        return A>>B &1;

        //second approach is to take 1 in 0th position from right LSB and move 1 to Bth position by left shifting
        //Now do the & of A & 1 to Bth position
//        return (A&(1<<B));
        int num = (1 << B);
        int x = (A & (1<<B)) ;
        System.out.println(x);
        return x;

    }

    public static void main(String[] args) {
        CheckBit cb = new CheckBit();
        System.out.println(cb.checkBit(5,2));
    }
}
