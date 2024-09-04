package com.interview.datastructures.carryforward.assignment;

public class PickBothSides {

    public int pickFromBothSides(int[] A, int B) {

        int N = A.length;
        int[] PS = new int[N + 1];
        PS[0] = 0;

        for (int i = 1; i < N + 1; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }

        int[] SS = new int[N + 1];
        SS[N] = 0;
        for (int i = N - 1; i >= 0; i--) {
            SS[i] = SS[i + 1] + A[i];
        }

        int[] PSR = new int[N+1];
        PSR[0] = 0;
        for (int i = 1; i <N+1; i++) {
            PSR[i] = PSR[i-1] + A[N-i];
        }

        // 0 5 3 6 7 9
        // 9 4 6 3 2 0

        //5, -2, 3, 1, 2
        //0  2  3   6  4 9
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < B; i++) {
            ans = Math.max(ans, PS[B - i ] + SS[B-i]);
//            ans = Math.max(ans, PS[B - i ] + SS[N-i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {5, -2, 3, 1, 2};
        PickBothSides pick = new PickBothSides();
        int ans = pick.pickFromBothSides(A, 3);
        System.out.println(ans);
    }

}
