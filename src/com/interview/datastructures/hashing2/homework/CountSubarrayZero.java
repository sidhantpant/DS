package com.interview.datastructures.hashing2.homework;

import java.util.HashMap;
import java.util.Map;

public class CountSubarrayZero {


    public int countSubarrayZeroSum(int[] A) {

        int N = A.length;
        int[] PS = new int[N + 1];
        PS[0] = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < N + 1; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }
        int max_length = 0;
        for (int i = 0; i < N + 1; i++) {
            int a = PS[i];
            int b = 0 + PS[i];

            if (map.containsKey(b)) {
                int length = i - map.get(b);
                max_length = Math.max(max_length, length);
            } else {
                map.put(PS[i], i);
            }

        }
        return max_length;
    }

    public static void main(String[] args) {
        int[] A = {9,-20,-11,-8,-4,2,-12,14,1};
        CountSubarrayZero cs = new CountSubarrayZero();
        System.out.println(cs.countSubarrayZeroSum(A));

    }
}
