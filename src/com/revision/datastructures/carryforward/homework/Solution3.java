package com.revision.datastructures.carryforward.homework;

import java.util.HashSet;
import java.util.Set;

/*
You are given a string S, and you have to find all the amazing substrings of S.
An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
*/
public class Solution3 {

    private static int substringStartingWithVowels(String S) {

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int N = S.length();
        long count = 0;
        for (int i = 0; i < N; i++) {
            if (vowels.contains(S.charAt(i))) {
                count = count + (N - i);
            }
        }
        return (int) (count % 10003);
    }

    public static void main(String[] args) {
        System.out.println(substringStartingWithVowels("ABEC"));
    }
}
