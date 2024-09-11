package com.interview.datastructures.intermediate.string.classromm;

import java.util.Map;
import java.util.TreeMap;

public class CharacterArray {


    public static void main(String[] args) {
        String s = "bdcacass";
        CharacterArray ch = new CharacterArray();
        ch.formCharArray(s);
        ch.frequencyArray(s);
    }

    public void formCharArray(String str) {
        char[] ch = str.toCharArray();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < ch.length; i++) {
            char key = ch[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        char[] ch1 = new char[ch.length];
        int k = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int val = entry.getValue();
            for (int i = 0; i < val; i++) {
                ch1[k] = key;
                k++;
            }
        }
        System.out.println(ch1);
    }

    public void frequencyArray(String str) { //bacbac
        char[] output = new char[str.length()];
        int[] freqArray = new int[26];
        for (int i = 0; i < str.length(); i++) {
            //update the count for index in freqArray,update b at 1st index,rather then 26 if else and update count
            freqArray[str.charAt(i) - 'a']++; // 'b'-'a' =1, 'c'-'a' = 2
        }
        int k = 0;
        for (int i = 0; i < 26; i++) {//iterate in char array of freq
            int count = freqArray[i];
            for(int j = 0 ; j < count ; j++){
                // this is the main step in need to get characters from freq array i.e i =0 will have a,
                //i = 1 will be b, i=2 =>'c'
                output[k] =  (char)(i+'a');
                k++;
            }
        }
        System.out.println(output);
    }


}
