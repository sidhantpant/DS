package com.practice.datastructures.strings.homework;

import java.util.Arrays;

public class Solution4 {

    private static int solve(String A, int B) {

        int N = A.length();
        int[] alphabetFreq = new int[26];
        int totalFreq = 0;
        int breakPoint = N;

        if (B == 0) return N;   //EdgeCase1

        //Counting freq of each character
        for (int i = 0; i < N; i++) {
            int idx = A.charAt(i) - 'a';
            alphabetFreq[idx]++;
            totalFreq++;
        }

        if (B >= totalFreq) return 1;   //EdgeCase2

        Arrays.sort(alphabetFreq);

        for (int i = 0; i < 26; i++) {
            if (alphabetFreq[i] <= B) {
                B -= alphabetFreq[i];
            } else {
                breakPoint = i;
                break;
            }
        }

        return 26 - breakPoint;

    }

    public static void main(String[] args) {
        String A = "abcabbccd";
        System.out.println(solve(A, 3));
    }

}
