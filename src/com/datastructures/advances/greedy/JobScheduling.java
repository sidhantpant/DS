package com.datastructures.advances.greedy;

import java.util.PriorityQueue;

public class JobScheduling {

    int scheduleJobs(int[] S,int[] E){

        int N = S.length;
        int M = E.length;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
        for (int i = 0; i < N; i++) {
            int[] pair = new int[2];
            pair[0] = S[i];
            pair[1] = E[i];
            minHeap.add(pair);
        }
        int lastEnd = 0;
        int selectedJobs = 0;
        for (int i = 0; i < N; i++) {
            int[] job = minHeap.poll();
            if(lastEnd<= job[0]){
                selectedJobs++;
                lastEnd = job[1];
            }
        }
        return selectedJobs;
    }

    public static void main(String[] args) {
        int[] A = {3, 2, 6};
        int[] B = {9, 8, 9};
        JobScheduling job = new JobScheduling();
        job.scheduleJobs(A,B);

    }
}
