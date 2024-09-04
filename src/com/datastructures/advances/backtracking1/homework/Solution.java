package com.datastructures.advances.backtracking1.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    List<String> ans = new ArrayList<>();;
    public String[] letterCombinations(String A) {
        Map<String, String> map = new HashMap<>();
        map.put("0", "0");
        map.put("1", "1");
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        
        ArrayList<String> arr = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        for(int i = 0; i < A.length(); i++){
            arr.add(map.get(A.charAt(i)+""));
        }
        generate(arr,curr,0);
        String[] res = new String[ans.size()];
        for(int i = 0 ; i < ans.size() ; i++){
            res[i] = ans.get(i);
        }
        return res;
    }

    public void generate( ArrayList<String> arr,  StringBuilder curr, int j){

     
        if(curr.length() == arr.size()){
            String str = curr.toString();
            ans.add(str);
            return;
        }

        String word = arr.get(j);
       
       //Iterate of each word and take just one letter at a time.
        for(int i = 0 ; i < word.length(); i++){
            String s = word.charAt(i)+"";
            curr.append(s);
            generate(arr, curr, j+1);
            curr.deleteCharAt(curr.length() - 1);
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.letterCombinations("234");
    }
}
