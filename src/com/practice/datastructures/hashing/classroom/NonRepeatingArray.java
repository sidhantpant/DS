package com.practice.datastructures.hashing.classroom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NonRepeatingArray {

    private static void firstNonRepeating(int[] A) {

        int N = A.length;
        Set<Integer> nonDuplicate = new HashSet<>();
        Set<Integer> repeatingElement = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int element = A[i];
            if (nonDuplicate.contains(element)) {
                repeatingElement.add(element);
            } else {
                nonDuplicate.add(element);
            }
        }

        for (int i = 0; i < N; i++) {
            int element = A[i];
            if(!repeatingElement.contains(element)){
                System.out.println(A[i]);
                break;
            }
        }
    }

    private static void nonRepeatingUsingHashMap(int[] A){

        int N = A.length;
        Map<Integer,Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < N; i++) {
            int element = A[i];
            if(!map.containsKey(element)){
                map.put(element,count);
            }else {
                map.put(element , map.get(element)+1);
            }
        }

        for (int i = 0; i < N; i++) {
            int elem = A[i];
            if(map.get(elem) == 1){
                System.out.println(elem);
                return;
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {

        int[] A = { 8,2,8,3,1,2,6,6,5 };
        firstNonRepeating(A);
//        nonRepeatingUsingHashMap(A);
    }
}
