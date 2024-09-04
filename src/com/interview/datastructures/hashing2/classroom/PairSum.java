package com.interview.datastructures.hashing2.classroom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairSum {

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
