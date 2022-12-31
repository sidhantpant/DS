package com.practice.datastructures.hashing.assignments;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int solve(int[] A) {
        int N = A.length;
        long[] PS = new long[N + 1];
        PS[0] = 0;
        for (int i = 1; i < N + 1; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }
        Set<Long> set1 = new HashSet<>();
        for (int i = 0; i < N + 1; i++) {
            set1.add(PS[i]);
        }
        if (set1.size() != PS.length) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        solve(new int[]{1, 2, 3, -6, -2, 1, 4});
    }
}
