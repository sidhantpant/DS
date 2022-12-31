package com.practice.datastructures.hashing.homework;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    private static int solve(String A) {
        int size = A.length();
        char[] ch = A.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(map.containsKey(ch[i])){
                if((map.get(ch[i]) %2)!=0){
                    count++;
//                    map.remove(ch[i]);
                }
            }
        }
        if(count >1){
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
       // aaabbb
        solve("mnxljrajwhxiaquajokwvoqqphylxpbanmmhfxsmssxzsdnprtgibuhaxnwxzfozexiascybplaaqjcthuydnoowmkzyamodzknkqmwdglqqnhflfslqyowcangsddhcjjuiyfbdkevlghbictrvnmnathotrekyrggwcmbzorqtyeowksywlbetsyhjvczcnvusfdrxythrhhoxtuuprqftgwohcgpngktkharijsovuknae"); // 5 // 9
    }
}
