package com.practice.datastructures.strings.classroom;

public class ReverseString {

    public static String reverseWord(String S) {

        int N = S.length();
        char[] C = S.toCharArray();
        reverse(C, 0, N - 1);
        int p1 = 0;
        for (int i = 0; i < N; i++) {
            if (C[i] == '_') {
                reverse(C, p1, i - 1);
//                p1 = i+1;
            } else {
                p1 = i + 1;
            }
        }
        reverse(C, p1, N - 1);
        return String.valueOf(C);
    }

    private static String reverseWordWhile(String S) {
        int N = S.length();
        char[] C = S.toCharArray();
        reverse(C, 0, N - 1);
        int p1 = 0;
        int p2 = 0;
        while (p2 < N) {
            if (C[p2] == '_') {
                reverse(C, p1, p2 - 1);
                p1 = p2 + 1;
                p2++;
            } else {
                p2++;
            }
        }
        reverse(C,p1,p2-1);
        return String.valueOf(C);
    }

    private static void reverse(char[] C, int s, int e) {

        while (s < e) {
            swap(C, s, e);
            s++;
            e--;
        }

    }

    private static void swap(char[] C, int s, int e) {
        char temp = C[s];
        C[s] = C[e];
        C[e] = temp;
    }

    public static void main(String[] args) {
        String S = "kill_marry_jane";
//        System.out.println(reverseWord(S));
        System.out.println(reverseWordWhile(S));
    }
}
