package com.datastructures.advances.twopointer.homework;

public class Solution1 {

    public int solve(int[] A, int B) {
        int N = A.length;
        int p1 = 0;
        int p2 = N - 1;
        int prod = 0;
        int count = 0;
        while (p1 <= p2) {
            prod = A[p1] * A[p2];
            if (prod < B) {
                count = p2 - p1 + 1;
                p1++;
            } else {
                p2--;
            }
        }
        return count * 2;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        Solution1 sol = new Solution1();
        sol.solve(A,5);
    }
}
