package com.practice.datastructures.strings.classroom;

public class Palindrome {

    private static boolean checkPalindrome(String S,int s,int e){
        char[] C = S.toCharArray();
        while (s < e){
            if(C[s] != C[e]){
                break;
            }
            s++;
            e--;
        }
        return true;
    }

    public static void main(String[] args) {
        String S= "dabnamanef";
        System.out.println(checkPalindrome(S,3,7));
    }
}
