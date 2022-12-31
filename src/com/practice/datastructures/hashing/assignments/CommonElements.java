package com.practice.datastructures.hashing.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonElements {

    public static int[] solve(int[] A, int[] B) {
        int N = A.length;
        int M = B.length;
        List<Integer> commonList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int element = A[i];
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }

        for (int i = 0; i < M; i++) {
            int element = B[i];
            if (map.containsKey(element) && map.get(element) > 0) {
                commonList.add(element);
                map.put(element, map.get(element) - 1);
            }
        }
        int[] commonArray = new int[commonList.size()];
        for (int i = 0; i < commonList.size(); i++) {
            commonArray[i] = commonList.get(i);
        }
        return commonArray;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 2, 1};
        int[] B = {2, 3, 1, 2};
        solve(A, B);
    }
}
