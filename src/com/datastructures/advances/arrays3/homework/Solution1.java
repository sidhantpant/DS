package com.datastructures.advances.arrays3.homework;

public class Solution1 {

    int maxJumps(int[] A){

        int N = A.length;
        int farthest = 0 ;
        int jumps = 0, currentJumpEnd = 0;
        for (int i = 0; i < N - 1; i++) {
            farthest = Math.max(farthest, i + A[i]);
            if (i == currentJumpEnd) {
                jumps++;
                currentJumpEnd = farthest;
            }
        }
        return jumps;

    }

    public static void main(String[] args) {
        int[] A = {4,7,1,1,2,1,1};
        Solution1 solution1 = new Solution1();
        solution1.maxJumps(A);
    }

}
