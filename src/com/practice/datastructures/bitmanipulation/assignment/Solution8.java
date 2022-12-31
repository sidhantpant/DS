package com.practice.datastructures.bitmanipulation.assignment;

public class Solution8 {

    private static int numberToDecimal(int A, int B) {

        int pow = 1;
        int ans = 0;
        while (A > 0) {
            int d = A % 10;
            ans = ans + (d * pow);
            A = A / 10;
            pow = pow * B;
        }
        return ans;

    }

    private static int numberToDecimal1(int A, int B) {

        double ans = 0;
        int count = 0;
        while (A > 0) {
            int d = A % 10;
            double val = Math.pow(B,count);
            ans = ans + (d * val);
            A = A / 10;
            count++;
        }
        return (int)ans;
    }



    public static void main(String[] args) {
        System.out.println(numberToDecimal(0132, 8));
    }

}
