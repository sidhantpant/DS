package com.datastructures.advances.sorting3.assignment;

import java.util.Arrays;

public class Solution3 {

    public int[][] solve(int[][] A, int B) {
        int N = A.length;
        int[] distance = new int[N];
        int[][] ans = new int[B][2];
        for (int i = 0; i < N; i++) {
            int p1 = A[i][0];
            int p2 = A[i][1];
            distance[i] = (p1 * p1) + (p2 * p2);
        }
        Arrays.sort(distance);
        // Find the B-th distance
        int distanceB = distance[B - 1];
        int k = 0;
        for (int i = 0; i < N; i++) {
            int x = A[i][0];
            int y = A[i][1];
            int dist = x * x + y * y;
            if (dist < distanceB) {
                ans[k][0] = x;
                ans[k][1] = y;
                k++;
            }
        }
        return ans;
    }
}
