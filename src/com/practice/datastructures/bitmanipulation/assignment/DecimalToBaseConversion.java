package com.practice.datastructures.bitmanipulation.assignment;

public class DecimalToBaseConversion {

    private static int decimalToAnyBase(int A, int B) {
        if (A == 0) {
            return 0;
        }
        StringBuilder SB = new StringBuilder();
        while (A > 0) {
            int d = A % B;
            SB = SB.append(d);
            A = A / B;
        }
        return Integer.valueOf(SB.reverse().toString());
    }

    private static int decimalToAnyBaseApproach1(int A, int B) {
        int power = 1;
        int ans = 0;
        while (A > 0) {
            int d = A % B;
            ans = ans + (d * power);
            A = A / B;
            power = power * 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(decimalToAnyBase(28, 2));
        System.out.println(decimalToAnyBaseApproach1(28, 2));
    }
}
