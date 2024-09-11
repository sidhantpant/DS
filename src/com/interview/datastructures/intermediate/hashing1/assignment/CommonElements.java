package com.interview.datastructures.intermediate.hashing1.assignment;

import java.util.*;

public class CommonElements {

    public static void main(String[] args) {
        int[] A = {1, 2, 2, 1};
        int[] B = {2, 3, 1, 2};
        CommonElements ce = new CommonElements();
        ce.findCommonElements(A, B);
        ce.findCommonElementsClean(A,B);
    }

    public int[] findCommonElements(int[] A, int[] B) {
        int N = A.length;
        int M = B.length;
        // 1 2 2 1
        // 2 3 1 2

        Map<Integer, Integer> mapA = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int key = A[i];
//            if (mapA.containsKey(key)) {
//                mapA.put(key, mapA.get(key) + 1);
//            } else {
//                mapA.put(key, 1);
//            }
            //cool way to add to map if value is present or increment the count for a key
            mapA.put(key, mapA.getOrDefault(key, 0 )+1);
        }
        List<Integer> ansList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            if (mapA.containsKey(B[i]) && mapA.get(B[i]) > 0) {
                int count = mapA.get(B[i]) - 1;
                mapA.put(B[i], count);
                ansList.add(B[i]);
            }
        }

        int[] ans = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }
        System.out.println(ans.toString());
        return ans;
    }

    public int[] findCommonElementsClean(int[] A , int[] B){
        int N = A.length;
        int M = B.length;

        Map<Integer,Integer> mapA = new HashMap<>();
        Map<Integer,Integer> mapB = new HashMap<>();

        for (int i = 0; i < N; i++) {
            mapA.put(A[i] ,mapA.getOrDefault(A[i],0)+1);
        }

        for (int i = 0; i < M; i++) {
            mapB.put(B[i],mapB.getOrDefault(B[i],0)+1);
        }

        List<Integer> ansList = new ArrayList<>();
        Set<Integer> keySetA = mapA.keySet();
        for(Integer keyA : mapA.keySet()){
            if(mapB.containsKey(keyA)){
                int val = Math.min(mapA.get(keyA),mapB.get(keyA));
                for(int i = 0 ; i < val ; i++){
                    ansList.add(keyA);
                }
            }
        }
        int[] ans = new int[ansList.size()];
        for(int i = 0 ; i < ansList.size();i++){
            ans[i] = ansList.get(i);
        }
        return ans;

    }
}
