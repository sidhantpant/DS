package com.datastructures.advances.heaps2;

import java.util.*;

public class KFrequent {

    public int[] solve(int[] A, int B) {

        int N = A.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < N ; i++){
            map.put(A[i], map.getOrDefault(A[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a, b)->Integer.compare(a.getValue(),b.getValue()));
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.offer(entry);
            if(pq.size() > B){
                pq.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        while(!pq.isEmpty()){
            result.add(pq.poll().getKey());
        }
        System.out.println(map.size());
        int[] ans = new int[result.size()];
        for(int i = 0 ; i < result.size(); i++){
            ans[i] = result.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {3,3,3,1,2,2,1,4};
        int B = 2;
        KFrequent k = new KFrequent();
        k.solve(A,B);
    }
}
