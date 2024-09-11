package com.interview.datastructures.intermediate.string.homework;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] A = {"abab", "ab", "abcd"};
//        String[] A = { "abcde", "abc"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
//        System.out.println(lcp.longestCommonPrefix(A));

        System.out.println(lcp.longestCommonPrefix1(A));
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
                    return prefix.toString();
                }
            }
            prefix.append(firstString.charAt(i));
        }
        return prefix.toString();
    }

    private String longestCommonPrefix1(String[] A) {

        int N = A.length;
        Arrays.sort(A);
        String firstStr = A[0];
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < firstStr.length(); i++) {
            char c = firstStr.charAt(i);
            for (int j = 1; j < N; j++) {
                String nextStr = A[j];
                if (c == nextStr.charAt(i)) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) sb.append(c);
        }
        return sb.toString();
    }

}
