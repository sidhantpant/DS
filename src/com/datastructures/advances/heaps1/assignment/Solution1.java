package com.datastructures.advances.heaps1.assignment;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution1 {

    public int nchoc(int A, int[] B) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>( Collections.reverseOrder());
        int N = B.length;
        for(int i=0 ;i < N ;i++){
            pq.add(B[i]);
        }
        int ans =0 ;
        for(int i = 0 ; i < A ; i++){
            int elem =  pq.poll();
            ans = ans + elem;
            int val = (int)Math.floor(elem/2);
            pq.add(val);
        }
        return ans % (1000*1000*1000 + 7);
    }

}
