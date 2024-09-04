package com.datastructures.advances.backtracking1.classroom;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public int[][] permute(int[] A) {
        int N = A.length;
        List<Integer> B = new ArrayList<>();
        boolean[] visited = new boolean[3];
        List<List<Integer>> result = new ArrayList();
        printAll(A,N,0,B,visited,result);
        int[][] resultInt =result.stream().map(l -> l.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
        return resultInt;
    }

    void printAll(int[] A,int N,int idx,List<Integer> B,boolean[] visited,List<List<Integer>> result){

        if(idx == N){
            result.addAll(new ArrayList(B));
            return ;
        }
        if(visited[idx] == false){
            visited[idx] = true;
            B.add(A[idx]);
            printAll(A,N,idx+1,B,visited,result);
            visited[idx] = false;
        }

    }
}

