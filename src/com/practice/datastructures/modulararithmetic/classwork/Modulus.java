package com.practice.datastructures.modulararithmetic.classwork;

public class Modulus {


    private static int power(int A,int N ,int P){
        int ans = 1;
        for (int i = 0; i < N; i++) {
            ans = ((ans%P) * (A%P))%P;
        }
        return ans;
    }
    private static int modulus(int[] A ,int P){
        int ans = 0;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            int first = A[i]%P ;
            int second = ((int)Math.pow( 10,N-1-i))%P;
            System.out.println(second);
            ans = ans + (first * second);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = { 1, 3, 2 ,4 ,4};
        System.out.println(modulus(A,5));
    }



}
