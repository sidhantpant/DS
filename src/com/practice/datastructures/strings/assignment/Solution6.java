package com.practice.datastructures.strings.assignment;

public class Solution6 {

    private static String solve(String A) {
        int N = A.length();
        char[] C = A.toCharArray();
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if ((C[i] >= 'A' && C[i] <= 90)) {
                continue;
            }
            if (C[i] == 'a' || C[i] == 'e' || C[i] == 'i' || C[i] == 'o' || C[i] == 'u') {
                SB.append('#');
            } else {
                SB.append(C[i]);
            }
        }
        String B = String.valueOf(SB);
        return B + B;
    }

    public static void main(String[] args) {
        String S = "AbcaZeoB";
        System.out.println(solve(S));
    }
}
