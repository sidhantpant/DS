package com.datastructures.advances.backtracking1.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution3 {

    List<List<Integer>> ans = new ArrayList<>();

    public int[][] permute(int[] A) {
        // Create a freq map no array since its not a char(a-z) 0-25
        int N = A.length;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            freqMap.put(A[i], freqMap.getOrDefault(A[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        permute(A,freqMap, N, 0, list);

        int[][] arr = ans.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
        return arr;

    }

    void permute(int[] A,Map<Integer, Integer> freqMap, int N, int idx, List<Integer> list) {

        if (idx == N) {
            ans.add(new ArrayList<>(list));
            return;
        }

        // Iterate over the elements in the frequency map
        for (int i = 0 ; i < N ; i++) {
            int  j = A[i];
            if (freqMap.get(j)!=null && freqMap.get(j) > 0) {
                list.add(j);
                freqMap.put(j, freqMap.get(j) - 1);
                permute(A,freqMap, N, idx + 1, list);
                freqMap.put(j, freqMap.get(j) + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {1,1,2};
        Solution3 sol3= new Solution3();
        sol3.permute(A);
    }

}
