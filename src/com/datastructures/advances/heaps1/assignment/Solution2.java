package com.datastructures.advances.heaps1.assignment;

import com.datastructures.advances.linkedlist1.classroom.Node;

import java.util.PriorityQueue;

public class Solution2 {

    public int solve(int[] A) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int N = A.length;
        for (int i = 0; i < N; i++) {
            pq.add(A[i]);
        }
        int ans = 0;
        while(pq.size() !=1){
            int l = pq.poll();
            int r = pq.poll();
            ans = ans+l+r;
            pq.add(l+r);
        }
        return ans;
    }

   int  solve1(int[] A){
        PriorityQueue < Integer > pq = new PriorityQueue();
        int cost = 0;

        // insert all elements in the queue
        for (int x: A) {
            pq.offer(x);
        }

        // keep on removing elements from the queue untill there is one element in the queue
        while (pq.size() != 1) {

            // Take the two ropes with smallest length
            int l1 = pq.poll();
            int l2 = pq.poll();
            // cost of combining these two ropes is l1 + l2.
            cost += l1 + l2;

            // add the newly formed rope of length l1 + l2 to the queue.
            pq.offer(l1 + l2);
        }

        return cost;

    }

    public static void main(String[] args) {
        int[] A = {1,18};// 9
        Solution2 sol = new Solution2();
        System.out.println(sol.solve(A));
    }
}
