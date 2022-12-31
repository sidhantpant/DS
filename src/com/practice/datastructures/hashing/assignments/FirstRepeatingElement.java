package com.practice.datastructures.hashing.assignments;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {

    private static int firstRepeatingElement(int[] A) {

        int N = A.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int element = A[i];
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }

        for (int i = 0; i < N; i++) {
            int key = A[i];
            if (map.containsKey(key) && map.get(key) > 1) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] A = {10, 1, 3, 4, 2, 5, 6};
        System.out.println(firstRepeatingElement(A));

    }
}
