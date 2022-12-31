package com.practice.datastructures.hashing.homework;

import java.util.*;

public class Solution1 {

    public static int getSum(int A, int B, int[] C) {

        int N = C.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int element = C[i];
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }

        List<Integer> occurrenceList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
            Integer val = entrySet.getValue();
            if (val.equals(B)) {
                occurrenceList.add(entrySet.getKey());
            }
        }
        int sum = 0;
        for (int i = 0; i < occurrenceList.size(); i++) {
            sum = sum + occurrenceList.get(i);
        }
        if(sum == 0){
            return -1;
        }
        return sum%(1000000000 + 7);

    }

    public static int getSum2(int A, int B, int[] C) {

        Map<Integer, Integer> mp = new HashMap<Integer,Integer>();
        int sz = C.length;
        for(int i=0 ; i<sz ; i++){
            if(mp.containsKey(C[i])){
                mp.replace(C[i], mp.get(C[i]), mp.get(C[i])+1);
            }
            else{
                mp.put(C[i], 1);
            }
        }
        int flag = 0, cnt = 0;
        for(Map.Entry<Integer,Integer> x : mp.entrySet()){
            if(flag==0 && x.getValue()==B){
                flag = 1;
            }
            if(x.getValue()==B){
                cnt += x.getKey();
                cnt %= 1000000007;
            }
        }
        if(cnt==0 && flag==0){
            cnt=-1;
        }
        return cnt;

    }

    public static void main(String[] args) {
        int[] C = { 0,0,1};
        System.out.println(getSum(3, 2, C));

        System.out.println(getSum2(3,2,C));
    }
}
