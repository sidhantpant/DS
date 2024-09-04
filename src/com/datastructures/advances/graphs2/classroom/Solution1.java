package com.datastructures.advances.graphs2.classroom;

import java.util.ArrayList;

public class Solution1 {

    public int solve(int A, int[][] B) {
        ArrayList<Integer>[] graph = new ArrayList[A+1];

        for (int i = 0; i < A+1 ; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < B.length; i++){
            int u = B[i][0];
            int v = B[i][1];
            graph[u].add(v);// it is a directed graph
        }
        boolean[] visited = new boolean[A+1];
        boolean path = dfs(graph,visited, 1);
        return visited[A] ? 1 : 0;
    }

    boolean dfs(ArrayList<Integer>[] graph,boolean[] visited,int s){
        if(visited[s] == true){
            return true;
        }
        visited[s] = true;
        for(int i = 0 ;i < graph[s].size();i++){
            int v = graph[s].get(i);
            dfs(graph,visited,v);
        }
        return false;
    }

    public static void main(String[] args) {
//        int[][] B = {{1,2},{2,3},{3,4},{4,5}};
        int[][] B = {{0,1},{1,2},{2,3},{3,1},{1,4}};
        Solution1 sol = new Solution1();
        System.out.println(sol.solve(5,B));
    }
}
