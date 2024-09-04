package com.datastructures.advances.backtracking1.homework;

import java.util.*;

public class Solution3 {

    List<List<Integer>> ans = new ArrayList<>();

    public int[][] subsetsWithDup(int[] A) {

        List<Integer> list = new ArrayList<>();
        int N = A.length;

        // populate the freqMap with their counts
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            freqMap.put(A[i], freqMap.getOrDefault(A[i], 0) + 1);
        }

        //add empty subarray
        ans.add(list);
        //sort the list to print
        Arrays.sort(A);
        generateSubset(A, list, N, 0, freqMap);
        int[][] res = ans.stream().map(l -> l.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
        return res;
    }

    void generateSubset(int[] A, List<Integer> list, int N, int idx, Map<Integer, Integer> freqMap) {

        if (idx == N) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i : freqMap.keySet()) {
            if (freqMap.get(A[i]) > 0) {
                list.add(A[i]);
            //    ans.add(new ArrayList<>(list));
                freqMap.put(A[i], freqMap.get(A[i]) - 1);
                generateSubset(A, list, N, idx + 1, freqMap);
                freqMap.put(A[i], freqMap.get(A[i] )+ 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {4};
        Solution3 sol = new Solution3();
        sol.subsetsWithDup(A);
    }

}
