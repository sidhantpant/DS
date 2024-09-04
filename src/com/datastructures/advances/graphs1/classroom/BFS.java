package com.datastructures.advances.graphs1.classroom;

import com.datastructures.advances.permutations.classroom.Permutations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    boolean bfs(int N,int E,int[] u,int[] v, int s,int d){
        ArrayList<Integer>[] graph = new ArrayList[N+1];
        for(int i = 0 ; i < E ;i++){
            //u[i],v[i] -> ith edge from u[i]->v[i]
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            graph[u[i]].add(v[i]);
            graph[v[i]].add(u[i]);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        boolean[] visited = new boolean[N+1];
        visited[s] = true;
        while(queue.size()>0) {

            //Step1: Get front Node from queue
            int current = queue.poll();
            //traverse on adjacency list of curr
            for (int i = 0; i < graph[current].size(); i++) {
                int cv = graph[current].get(i);
                if(visited[cv] == false){
                    visited[current] = true;
                    queue.add(cv);
                }
            }
        }
        return visited[d];
    }

    public static void main(String[] args) {
        BFS bfs = new BFS();
        int[] u = {1,1,2,2,3,5,4};
        int[] v = {2,4,4,3,5,6,5};

        bfs.bfs(6,7,u,v,1,6);
    }
}
