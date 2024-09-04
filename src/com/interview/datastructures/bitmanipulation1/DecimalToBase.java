package com.interview.datastructures.bitmanipulation1;

public class DecimalToBase {

    public int decimalToAnyBase(int A, int B) {

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
        DecimalToBase dtb = new DecimalToBase();
        System.out.println(dtb.decimalToAnyBase(52,5));
    }

}
