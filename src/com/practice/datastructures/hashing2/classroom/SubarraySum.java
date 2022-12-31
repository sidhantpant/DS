package com.practice.datastructures.hashing2.classroom;

import java.util.HashSet;
import java.util.Set;

public class SubarraySum {

    private static boolean checkSubarraySum(int[] A) {
        int N = A.length;
        int[] PS = new int[N + 1];
        PS[0] = 0;
        for (int i = 1; i < N + 1; i++) {
            PS[i] = A[i - 1] + PS[i - 1];
        }

        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < PS.length; i++) {
            hashSet.add(PS[i]);
        }
        return hashSet.size() != PS.length;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, -6, -2, 1, 4};// 0 1 3 6 0 -2 -1 3
        int[] A1 = {0, 1, 2, 3, 4}; // 0 0 1 3 6 10 // 0 1 3 6 10
        System.out.println(checkSubarraySum(A1));
    }
}
