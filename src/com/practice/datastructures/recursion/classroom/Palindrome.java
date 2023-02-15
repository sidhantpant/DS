package com.practice.datastructures.recursion.classroom;

public class Palindrome {

    static boolean checkPalindrome(char[] A, int s, int e) {
        // MADAM
        if (s >= e) {
            return true;
        }
        if (A[s] != A[e]) {
            return false;
        }
        s++;
        e--;
        return checkPalindrome(A, s, e);
    }

    static boolean checkPalindromeBetter(char[] A, int s, int e) {
        // MADAM
        if (s >= e) {
            return true;
        }
        s++;e--;
        if (A[s] == A[e] && checkPalindromeBetter(A, s, e)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "ABBA";
//        System.out.println(checkPalindrome(s.toCharArray(),0,s.length()-1));
        System.out.println(checkPalindromeBetter(s.toCharArray(), 0, s.length() - 1));
    }
}
