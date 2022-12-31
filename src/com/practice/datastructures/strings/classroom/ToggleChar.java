package com.practice.datastructures.strings.classroom;

public class ToggleChar {

    private static String toggleChar(String A) {

        int N = A.length();
        char[] S = A.toCharArray();
        for (int i = 0; i < N; i++) {
            if (S[i] >= 'A' && S[i] <= 'Z') { // can also use S[i] >= 65 && S[i] <= 90
                S[i] = (char) (S[i] + 32);
            } else if (S[i] >= 97 && S[i] <= 122) {// can also use S[i] >= 'a' && S[i] <= 'z'
                S[i] = (char) (S[i] - 32);
            }
        }


        return String.valueOf(S);
    }

    private static String toggleCharUsingSetBit(String A) {

        int N = A.length();
        char[] S = A.toCharArray();
        for (int i = 0; i < N; i++) {
//            S[i] = (char) (S[i] ^32);
            S[i] = (char) (S[i] ^ (1 << 5));
        }
        return String.valueOf(S);
    }

    public static void main(String[] args) {
        String S = "ANAconDA";
//        System.out.println(toggleChar(S));
        System.out.println(toggleCharUsingSetBit(S));
    }

}
