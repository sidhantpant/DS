package com.datastructures.advances.binarysearch1.assignment;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {

    public int solve(int[] A) {
        int N = A.length;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (hm.containsKey(A[i])) {
                hm.put(A[i], hm.get(A[i]) + 1);
            } else {
                hm.put(A[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entrySet : hm.entrySet()) {
            int key = entrySet.getKey();
            if (hm.get(key) == 1) {
                return key;
            }
        }
        return A[0];
    }

    public static void main(String[] args) {
        int[] A = {2,2,3,3,5,5,6};
        Duplicate dup = new Duplicate();
        dup.solve(A);
    }

}
