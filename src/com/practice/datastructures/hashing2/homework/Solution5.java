package com.practice.datastructures.hashing2.homework;

import java.util.HashMap;
import java.util.Map;

public class Solution5 {

    private static int solve(int[] A, int B) {
        int N = A.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            int a = A[i];
            int b = B - a;
            if (map.containsKey(b)) {
//                count++;
                count = count + map.get(B - a);
            }
            if (map.containsKey(b) && map.get(a) > 1) {
                count = count - 1;
            }
        }
        return (count + 1) / 2;

    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 2};
        System.out.println(solve(A, 8));
    }

    public int solve1(int[] A, int B) {
        int N = A.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        long count = 0;
        final int mod = (int) (1e9 + 7);
        for (int i = 0; i < N; i++) {
            int a = A[i];
            int b = B - a;

            if (a != b) {
                if (map.containsKey(b)) {
                    count = (count + 1) % mod;
                }
            }
        }
        return (int) (count);
    }

}
