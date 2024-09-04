package com.datastructures.advances.graphs1.classroom;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    boolean solve(int A,int[][] B){

        List<Integer>[] graph = new ArrayList[A+1];
        for(int i =0 ; i < A+1 ; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < B.length ;i++){
            int u = B[i][0];
            int v = B[i][1];
            graph[u].add(v);
        }

        boolean[] visited = new boolean[A+1];
        boolean[] path = new boolean[A+1];
        for(int i =0 ; i < A ; i++){
            if(!visited[i] && dfs(graph,i,visited,path)){
                return true;
            }
        }
        return false;
    }

    boolean dfs(List<Integer>[] graph,int s, boolean[] visited ,boolean[] path){
        visited[s] = true;
        path[s] = true;
        for(int i = 0 ; i < graph[s].size();i++){
            int cv = graph[s].get(i);
            if(path[cv] == true){
                return true;
            }
            if(visited[cv] == false && dfs(graph,cv,visited,path)){
                return true;
            }
        }
        path[s] = false;
        return false;
    }

    public static void main(String[] args) {
//        int[][] B = {{1,2},{4,1},{2,4},{3,4},{5,2},{1,3}};
        int[][] B = {{0,1},{1,2},{2,3},{3,1},{1,4}};
        Solution2 sol = new Solution2();
        System.out.println(sol.solve(5,B));
    }
}
