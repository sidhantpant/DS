package com.practice.datastructures.subarrays.assignment;

import java.util.ArrayList;
import java.util.List;

public class Solution6 {

    private static int[] solve(int[] A, int B) {
        int N = A.length;
        int length = 2 * B + 1;
        List<Integer> alterList = new ArrayList<>();
        for (int i = 0; i <= N-length; i++) {
            int equilibriumIndex = checkEquilibrium(A, length, i);
            if (equilibriumIndex >= 0) {
                alterList.add(equilibriumIndex+i);
            }
        }
        int[] alterArray = new int[alterList.size()];
        for (int i = 0; i < alterList.size(); i++) {
            alterArray[i] = alterList.get(i);
        }
        return alterArray;
    }

    private static int checkEquilibrium(int[] A, int length, int i) {

        int N = length;
        int[] PS = new int[N + 1];
        PS[0] = 0;
        for (int j = 1; j < N + 1; j++) {
            PS[j] = PS[j - 1] + A[i];
            i++;
        }
        int B = PS.length;
        for (int j = 1; j < B; j++) {
            int sumLeft = PS[j - 1];
            int sumRight = PS[B - 1] - PS[j];
            if (sumLeft == sumRight) {
                return j - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1, 0, 1, 0, 1};
        int[] A1 = {0, 0, 0, 1, 1, 0, 1};
        int[] A3 = { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1};
        int B = 0;
        solve(A1, B);
    }


}
