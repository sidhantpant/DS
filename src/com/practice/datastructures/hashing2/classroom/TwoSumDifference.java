package com.practice.datastructures.hashing2.classroom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSumDifference {

    private static boolean twoSumDifferent(int[] A, int K) {

        int N = A.length;
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if (integerSet.contains(K + A[i])) {
                return true;
            }
            integerSet.add(A[i]);
        }
        return false;

    }

    private static int twoSumDifference(int[] A, int K) {

        int N = A.length;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        }
        for (int i = 0; i < N; i++) {
            int a = A[i];
            int b = K-a;
            if(a!=b){
                if(map.containsKey(b)){
                    count++;
                }
            }else{
                if(map.containsKey(b) && map.get(a)>1){
                    count++;
                }
            }

        }
        return count;

    }

    public static void main(String[] args) {

        int[] A1 = {1,1, 8, 2, 7, 5};
        int[] A2 = {1, 2, 7, 5, 8};
        int[] A = {5};
//        System.out.println(twoSumDifferent(A1, 3));
        System.out.println(twoSumDifference(A1, 3));
    }

}
