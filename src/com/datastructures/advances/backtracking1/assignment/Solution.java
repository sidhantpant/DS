package com.datastructures.advances.backtracking1.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    List<List<Integer>> ans=new ArrayList<>();
    public int[][] subsets(int[] A) {
        Arrays.sort(A);;
        int i = 0;
        List<Integer> list = new ArrayList<>();
        ans.add(list);
        generateSubset(A,i,list);

        int[][] arr = ans.stream()
            .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
            .toArray(int[][]::new);
        return arr;

    }

    void generateSubset(int[] A, int i, List<Integer> list){
        if(i == A.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(A[i]);
        generateSubset(A,i+1,list);
        list.remove(list.size()-1);
        generateSubset(A,i+1,list);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = {2,3};
        sol.subsets(A);
    }
}
