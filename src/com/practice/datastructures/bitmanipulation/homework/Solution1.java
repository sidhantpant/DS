package com.practice.datastructures.bitmanipulation.homework;

public class Solution1 {

    private static int solve(int A, int B) {
        int val = A ^ B;
        int first = decimalToBinary(A);
        int second = decimalToBinary(B);
        int ans = first ^ second;
        int check = numberToDecimal(ans, 2);
        System.out.println(ans);
        System.out.println(check);
        return val;
    }


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

    private static int decimalToBinary(int A) {
        int power = 1;
        int ans = 0;
        while (A > 0) {
            int d = A % 2;
            ans = ans + (d * power);
            A = A / 2;
            power = power * 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        solve(9, 17);
    }
}
