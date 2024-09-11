package com.interview.datastructures.intermediate.hashing2.assignment;

import java.util.HashMap;
import java.util.Map;

public class DiffkII {

    public static void main(String[] args) {
        int[] A = {1, 5, 3};
        DiffkII d = new DiffkII();
        System.out.println(d.solve(A, 2));
    }

    public int solve(int[] A, int B) {

        int N = A.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int a = A[i];
            int b = B+A[i];
            int c = B-A[i];
            if (map.containsKey(b) && map.containsKey(c)) {
                return 1;
            }
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        return -1;

    }
}
