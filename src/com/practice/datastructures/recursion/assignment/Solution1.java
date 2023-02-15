package com.practice.datastructures.recursion.assignment;

public class Solution1 {


    public int solve(String A) {
        int s = 0;
        int e = A.length() - 1;
        if (isPalindrome(A, s, e)) {
            return 1;
        }
        return 0;

    }

    boolean isPalindrome(String A, int s, int e) {

        if (s >= e) {
            return true;
        }
        s++;
        e--;
        if (A.charAt(s) == A.charAt(e) && isPalindrome(A, s, e)) {
            return true;
        }
        return false;

    }
}
