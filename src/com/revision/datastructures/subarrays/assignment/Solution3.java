package com.revision.datastructures.subarrays.assignment;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {

    private static int[] leaderTowardsRight(int[] A){

        int N = A.length;
        int max = A[N-1];
        List<Integer> leaderList = new ArrayList<>();
        leaderList.add(max);
        for (int i = N-2; i >= 0; i--) {
            if(A[i] > max){
                max = A[i];
                leaderList.add(A[i]);
            }
        }
        int[] leaderArray = new int[leaderList.size()];
        for (int i = 0; i < leaderArray.length; i++) {
            leaderArray[i] = leaderList.get(i);
        }
        return leaderArray;
    }

    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};
        System.out.println(leaderTowardsRight(A));
    }
}
