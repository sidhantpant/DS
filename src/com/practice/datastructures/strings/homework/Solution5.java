package com.practice.datastructures.strings.homework;

import java.util.Arrays;

public class Solution5 {

    private static String longestCommonPrefix(String[] A){

       int size = A.length;
        Arrays.sort(A);
        int end = Math.min(A[0].length(), A[size-1].length());
        int i = 0;
        while(i < end && A[0].charAt(i) == A[size-1].charAt(i)){
                i++;
        }
        String pre = A[0].substring(0,i);
        return pre;
    }

    private static String longestCommonPrefix1(String[] A){
        int N = A.length;
        Arrays.sort(A);
        String first = A[0];
        String last = A[N-1];
        String prefix = "";
        for(int i = 0 ;i < first.length() ;i++ ){
            if(first.charAt(i) == last.charAt(i)){
                prefix+=first.charAt(i);
            }else{
                break;
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] A = {"abab", "ab", "abcd"};
//        longestCommonPrefix(A);
        System.out.println(longestCommonPrefix1(A));
    }
}
