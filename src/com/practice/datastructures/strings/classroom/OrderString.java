package com.practice.datastructures.strings.classroom;

import java.util.Arrays;

public class OrderString {

    private static String orderString(String A) {
        char[] S = A.toCharArray();
        Arrays.sort(S);
        return String.valueOf(S);
    }

    private static String orderStringOptimised(String A) {
        char[] S = A.toCharArray();
        System.out.println((char) 32);
        int N = S.length;

        char[] C = new char[26];
        for (int i = 0; i < N; i++) {
            C[S[i] - 'a']++;
        }

        int k = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 1; j <= C[i]; j++) {
                S[k] = (char) (i + 'a');
                k++;
            }

        }
        return String.valueOf(S);
    }

    private static String orderStringWhileOptimised(String A) {
        int N = A.length();
        char[] S = A.toCharArray();
        char[] C = new char[26];
        for (int i = 0; i < N; i++) {
            C[S[i] - 'a']++;
        }
        int k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= C[i]; j++) {
                S[k] = (char) (i + 'a');
                k++;
            }
        }
        return String.valueOf(S);
    }


    public static void main(String[] args) {
        String S = "dabacbd";
//        System.out.println(orderString(S));
//        System.out.println(orderStringOptimised(S));
        System.out.println(orderStringWhileOptimised(S));
    }

}
