package com.practice.datastructures.intro.day1;

public class Solution5 {

    public static int power(final int A, final int B) {
        int ans = A;
        if(B==0)return 1;
        for(int i=1;i<B;i++){
            ans = ans*A;
        }
        return ans;
    }

    public static int power1(final int A, final int B) {
        int ans = 1;
        for(int i=1;i<=B;i++){
            ans = ans*A;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(power(2,0));
    }

}
