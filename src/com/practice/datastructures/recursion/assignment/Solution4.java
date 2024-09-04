package com.practice.datastructures.recursion.assignment;

public class Solution4 {

    static String reverseString(String A) {
        if(A == null || A.length()==0){
            return A;
        }
        int N = A.length();
        String s = A.charAt(N-1) + reverseString(A.substring(0, N - 1));
        return s;
    }

    public static String reverseString1(String A){

        if(A == null || A.isEmpty()){
            return A;
        }
        return A.substring(A.length()-1) + reverseString1(A.substring(0,A.length()-1));
    }

    public static void main(String[] args) {
        String a = "scaleracademy";
        System.out.println(reverseString(a).equals("ymedacarelacs"));
    }
}
