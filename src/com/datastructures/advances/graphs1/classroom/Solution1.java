package com.datastructures.advances.graphs1.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {

    int path(int N,int E,int[] u, int[] v, int s, int d,boolean[] visited){

        List<Integer>[] graph = new ArrayList[N+1];
        Arrays.fill(visited,false);
        //initialising the list
        for (int i = 0; i < E; i++) {
            graph[i] = new ArrayList<>();
        }

        //Adding nodes and edges for adjacency list
        for (int i = 0; i < E; i++) {
            graph[u[i]].add(v[i]);
            graph[v[i]].add(u[i]);
        }

        dfs(graph,visited,s) ;
        return visited[d]? 1 : 0;
    }

    boolean dfs(List<Integer>[] graph,boolean[] visited, int s ){

        if(visited[s] == true){
            return true;
        }
        visited[s] = true;
        for (int i = 0; i < graph[s].size(); i++) {
            int cv = graph[s].get(s);
            return dfs(graph,visited,cv);
        }
        return false;
    }


}
