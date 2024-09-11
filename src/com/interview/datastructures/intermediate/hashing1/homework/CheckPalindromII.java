package com.interview.datastructures.intermediate.hashing1.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckPalindromII {

    public int rearrangeToCheckPalindrom(String A) {
        // r a c e c a r , a a a b b b c c c
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = A.toCharArray();
        int N = ch.length;
        for (int i = 0; i < N; i++) {
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        int count = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if(value %2 != 0){
                count++;
            }
        }
        if(count > 1){
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        CheckPalindromII cp = new CheckPalindromII();
        cp.rearrangeToCheckPalindrom("abcd");
    }
}

