package com.datastructures.advances.hashing1.advanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {

    public int[] solve(int[] A, int[] B) {

        int N = A.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        int M = B.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            if (map.containsKey(B[i])) {
                int count = map.get(B[i]);
                while (count > 0) {
                    list.add(B[i]);
                    count--;
                }
                map.remove(B[i]);
            }
        }
        for (int i = 0; i < N; i++) {
            if (map.containsKey(A[i])) {
                list.add(A[i]);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 4};
        int[] B = {5, 4, 2};
        Solution1 sol = new Solution1();
        sol.solve(A,B);
    }

}
