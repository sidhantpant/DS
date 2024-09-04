package com.interview.datastructures.subarrays.assignment;

import java.util.ArrayList;
import java.util.List;

public class LeaderArray {


    public int[] leaderArrayBruteForce(int[] A){
        int N = A.length;
        List<Integer> leader = new ArrayList<>();
        leader.add(A[N-1]);
        for (int i = N-2; i >= 0 ; i--) {
            int max_right_value = Integer.MIN_VALUE;
            for(int j = i+1 ; j < N ; j++){
                max_right_value = Math.max(A[j],max_right_value);
            }
            if(A[i] > max_right_value){
                leader.add(A[i]);
            }
        }
        int M = leader.size();
        int[] ans = new int[M];
        for (int i = 0; i < M; i++) {
            ans[i] = leader.get(i);
        }
        return ans;
    }
    public int[] leaderArray(int[] A) {

        int N = A.length;
        int[] leader = new int[N];
        int max_right_value = A[N - 1];
        leader[0] = max_right_value;
        int size = 1;
        for (int i = N - 2; i >= 0; i--) {
            if (A[i] > max_right_value) {
                max_right_value = A[i];
                leader[size] = max_right_value;
                size++;
            }
        }

        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i] = leader[i];
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] A = {16, 17, 4, 3, 5, 2};
        LeaderArray la = new LeaderArray();
        la.leaderArrayBruteForce(A);
        la.leaderArray(A);
    }


}
