package com.interview.datastructures.intermediate.recursion1.assignment;

public class PalindromeRecursion {

    public static void main(String[] args) {
        PalindromeRecursion pr = new PalindromeRecursion();
        System.out.println(pr.solve("namnan"));
    }

    public int solve(String A) {
        int N = A.length();
        boolean x = isPalindrome(A, 0, N - 1);
        return x ? 1 : -1;
    }

    public boolean isPalindrome(String str, int s, int e) {
        if (s > e) {
            return true;
        }
        if (str.charAt(s) != str.charAt(e)) {
            return false;
        }
        return isPalindrome(str, s + 1, e - 1);
    }


    public boolean isPalindrome1(String str,int s, int e){

        if(s > e){
            return true;
        }

        if(str.charAt(s) == str.charAt(e)){
            return isPalindrome(str,s+1,e-1);
        }
        return false;
    }

}
