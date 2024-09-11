package com.interview.datastructures.intermediate.string.homework;

import java.util.Arrays;

public class DistinctCharacters {

    public int distinctCharacters(String A,int B){
        // d 5 25
        // b 4 24
        // c 2 23
        // a 2

        int[] freq = new int[26];
        for (int i = 0; i < A.length(); i++) {
            freq[A.charAt(i)-'a']++; // main logic need to do b-'a' = i
        }
        Arrays.sort(freq);
        int breakPoint = 0;
        for (int i = 0; i < 26; i++) {
            int size = freq[i];
            if(size <= B ){
                B = B-size;
            }else{
                breakPoint = i;
                break;
            }
        }
        System.out.println(breakPoint);
        return 26-breakPoint;
    }

    public static void main(String[] args) {
        String s = "abcabbccd";//d1 a2 b3 c3
        DistinctCharacters dc = new DistinctCharacters();
        System.out.println(dc.distinctCharacters(s,3));
    }

}
