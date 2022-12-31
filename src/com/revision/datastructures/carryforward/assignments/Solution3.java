package com.revision.datastructures.carryforward.assignments;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {

    private static int countLeaders(int[] A){

        int N = A.length;
        int count = 1;
        int maxTillNow = A[0];
        for (int i = 1; i < N; i++) {
            if(A[i] > maxTillNow){
                maxTillNow = A[i];
                count++;
            }
        }
        return count;
    }

    private static int[] leadersRight(int[] A){

        int N = A.length;
        List<Integer> leaderList = new ArrayList<>();
        int max = A[N-1];
        leaderList.add(max);
        for (int i = N-2; i >=0 ; i--) {
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
        int[] A = {2,5,1,9,11,6,4,15};
        System.out.println(countLeaders(A));
        int[] B = {16, 17, 4, 3, 5, 2};
        leadersRight(B);
    }
}
