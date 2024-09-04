package com.interview.datastructures.String.homework;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] A = {"abab", "ab", "abcd"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(A));
    }

    public String longestCommonPrefix(String[] A) {
        //["ab", "abab", "abcd"]
        Arrays.sort(A);
        int min_length = A[0].length();
        int N = A.length;
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < min_length; i++) {
            String firstString = A[0];
            for (int j = 1; j < N; j++) {
                char nextStringChar = A[j].charAt(i);
                if (firstString.charAt(i) != nextStringChar) {
                    break;
                }
            }
            prefix.append(firstString.charAt(i));
        }
        return prefix.toString();
    }

}
