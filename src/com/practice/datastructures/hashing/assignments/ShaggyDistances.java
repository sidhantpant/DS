package com.practice.datastructures.hashing.assignments;

import java.util.HashMap;
import java.util.Map;

public class ShaggyDistances {

    private static int shaggyDistances(int[] A) {

        int N = A.length;
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int key = A[i];
            if (map.containsKey(key)) {
                int val = map.get(key);
                min = Math.min(min, i - val);
                map.put(key, i);
            } else {
                map.put(key, i);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] A1 = {7, 1, 3, 4, 1, 7};
        int[] A = {1,1};
        System.out.println(shaggyDistances(A));
    }
}
