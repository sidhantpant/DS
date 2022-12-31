package com.practice.datastructures.carryforward.assignment;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {

    private static int[] solve(int[] A) {
        List<Integer> leaderArray = new ArrayList<>();
        int N = A.length;
        for (int i = 0; i < N; i++) {
            boolean check = true;
            for (int j = i + 1; j < N; j++) {
                if (A[i] < A[j]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                leaderArray.add(A[i]);
            }
        }
        int[] arr = new int[leaderArray.size()];
        for (int i = 0; i < leaderArray.size(); i++) {
            arr[i] = leaderArray.get(i);
        }
        return arr;
    }

    private static int[] maxCarryFwd(int[] A) {
        int N = A.length;
        List<Integer> leaderList = new ArrayList<>();
        int maxElem = A[N - 1];
        leaderList.add(maxElem);
        for (int i = N-2; i >= 0; i--) {
            if(A[i] > maxElem){
                maxElem = A[i];
                leaderList.add(maxElem);
            }
        }
        int M = leaderList.size();
        int[] leaderArray = new int[M];
        for (int i = 0; i < M ; i++) {
            leaderArray[i] = leaderList.get(i);
        }
        return leaderArray;
    }

    public static void main(String[] args) {
        int[] A = {16, 17, 5, 3, 4, 2, 1};
        solve(A);
        maxCarryFwd(A);
    }

}
