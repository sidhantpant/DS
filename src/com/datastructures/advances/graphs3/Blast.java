package com.datastructures.advances.graphs3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Blast {

    int blast(List<Pair<Integer,Integer>> graph[],int N,int s,int dest){
        int time[] = new int[N+1];
        Arrays.fill(time,Integer.MAX_VALUE);
        PriorityQueue<Pair<Integer,Integer>> minHeap = new PriorityQueue<>();
        minHeap.add(new Pair<>(0,s));

        while (minHeap.size()>0){
            Pair pair = minHeap.peek();
            minHeap.remove();
            Integer u = (Integer) pair.second;
            Integer t = (Integer) pair.first;

            if(t > time[u]){
                continue;
            }
            for (int i = 0; i < graph[u].size(); i++) {
                Pair ele = graph[u].get(i);
                Integer v = (Integer) ele.first;
                Integer w = (Integer)ele.second;
                if(t+w < time[v]){
                    time[v] = t+w;
                    minHeap.add(new Pair<>(time[v],v));
                }
            }
        }
        return time[dest];
    }
}

class Pair<T,U> {

    T first;
    U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}
