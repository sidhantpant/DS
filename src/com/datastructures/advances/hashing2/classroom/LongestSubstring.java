package com.datastructures.advances.hashing2.classroom;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public int longestSubstring(String S){

        int N = S.length();
        int ans = 0 ;
        for (int i = 0 ;i< N ; i ++){
            for (int j = i; j < N; j++) {
                Set<Character> hs = new HashSet<>();
                for (int k = i; k <= j; k++) {
                    hs.add(S.charAt(k));
                }
                if(hs.size() == j-i+1){
                    ans = Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }

    public int longestSubstringOptimised(String S){

        int N = S.length();
        int ans = 0 ;
        for (int i = 0; i < N; i++) {
            Set<Character> hs = new HashSet<>();
            for (int j = i; j < N; j++) {
                if(hs.contains(S.charAt(j))){
                    break;
                }else{
                    hs.add(S.charAt(j));
                }
            }
            ans = Math.max(ans,hs.size());
        }
        return ans;
    }

    public int longDis(String S){
        int N = S.length();
        int i =0 ;
        int j = 0 ;
        Set<Character> hs = new HashSet<>();
        int ans = 0 ;
        while(j < N){
            if(!hs.contains(S.charAt(j))){
                hs.add(S.charAt(j));
                ans = Math.max(ans,hs.size());
            }else{
                hs.remove(S.charAt(i));
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestSubstring ls = new LongestSubstring();
        ls.longestSubstring("sippier");
        ls.longestSubstringOptimised("sippier");
    }

}
