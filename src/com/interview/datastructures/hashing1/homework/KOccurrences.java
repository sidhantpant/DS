package com.interview.datastructures.hashing1.homework;

import java.util.HashMap;
import java.util.Map;

public class KOccurrences {
    //This quest is simple form a map from array check if it is = B ,do the some of all key with value B
    //But the catch is the edge case if no elem found return -1 but if [0 0 1] height is 0 and occurence = B
    //then also it should return 0 if we don't add flag it will return -1 since sum == 0
    public int KOccurences(int A,int B,int[] C){

        int mod = 1000000007;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < A; i++) {
            //prepare a freq map
            map.put(C[i], map.getOrDefault(C[i],0)+1);
        }
        int sum = 0 ;
        int flag = -1;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if(value == B){
                sum = sum + entry.getKey();
                sum = sum % mod;
                flag = 0;
            }
        }
        if(sum == 0 && flag == -1){
            return -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        KOccurrences k = new KOccurrences();
//        int[] A = {1,2,3,4,5};
        int[] A = {0,0,1};
        System.out.println(k.KOccurences(3,2,A));
    }
}
