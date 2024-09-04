package com.datastructures.advances.heaps1.homework;

import java.util.PriorityQueue;

public class Solution2 {
    int sum = 0;
    int i = 0;


    public static void main(String[] args) {
        int[] A = {57, 3, -14, -87, 42, 38, 31, -7, -28, -61};
        Solution2 sol = new Solution2();
        sol.solve(A, 10);

    }

    public int solve(int[] A, int B) {
        int N = A.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.add(A[i]);
        }
        while (pq.size() > 0 && B > 0) {
            int min = pq.poll();
            if(pq.peek() < 0){
                pq.add(-min);
            }else{
                min = -min;
                pq.add(min);
            }
            B--;
        }
        int sum = 0;
        while(pq.size() > 0) {
            sum = sum + pq.poll();
        }
        return sum;
    }


    public int solve1(int[] A, int B) {
        int N = A.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.add(A[i]);
        }
        while (B > 0 && pq.size() > 0) {
            int min = pq.poll();
            if (min == 0) {
                B = 0;
            } else if (min < 0) {
                pq.add(-min);
            } else {
                if (min % 2 == 0) {
                    pq.add(min);
                } else {
                    pq.add(-min);
                }
                break;
            }
            B--;
        }
        int ans = 0;
        while(pq.size() > 0) {
            ans = ans + pq.poll();
        }
        return N;
    }
}

