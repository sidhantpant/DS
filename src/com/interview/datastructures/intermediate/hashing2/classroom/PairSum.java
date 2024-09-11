package com.interview.datastructures.intermediate.hashing2.classroom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairSum {

    //easiest way to do this use a map check freq for same element
    public boolean pairSumHashMap(int[] A, int B) {

        int N = A.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        for (int i = 0; i < N; i++) {
            int a = A[i];
            int b = B - A[i];
            // to handle edge case of i=j check freq of elem > 1and for rest check if other pair present in map
            if (a != b && map.containsKey(b)) {
                return true;
            } else if (a == b && map.get(b) > 1) {
                return true;
            }

        }
        return false;

    }

    //optimised using hash map.Add to hash set while iterating and check if present..For every i check all
    //i-1 if the pair is present in the hash set and then add.
    public boolean targetSumHashSet(int[] A, int K) {
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int b = K - A[i];
            if (set.contains(b)) {
                return true;
            }
            set.add(A[i]);
        }
        return false;
    }

}
