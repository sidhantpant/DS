package com.datastructures.advances.graphs3;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TopologicalSort {

    void topologicalSort(List<Integer>[] graph,int N){
        int[] in = new int[N+1];

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                int v = graph[i].get(j);
                in[v]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if(in[i] == 0){
                queue.add(i);
            }
        }

        while(queue.size()>0){
            int u = queue.peek();
            queue.remove();
            for (int i = 0; i < graph[u].size(); i++) {
                int v = graph[u].get(i);
                in[v]--;
                if(in[v]==0){
                    queue.add(v);
                }
            }
        }
        ExecutorService dr = Executors.newCachedThreadPool();
    }
}
