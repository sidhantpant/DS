package com.datastructures.advances.binarysearch1.assignment;

public class Solution4 {

    int solve(int[] A) {
        int N = A.length;
        int l = 0;
        int h = N - 1;
        int ans = 0;
        while (l <= h) {
            boolean isEven = false;
            int m = (l + h) / 2;
            if (m == N - 1) {
                return A[m];
            }
            if (m % 2 == 0) {
                isEven = true;
            } else {
                isEven = false;
            }

            if (isEven) {
                //check for the occurrence
                if (A[m] == A[m + 1]) {
                    //first occurrence
                    l = m + 1;
                } else if (A[m] == A[m - 1]) {
                    //second occurrence
                    h = m - 1;
                } else {
                    ans = m;
                    return A[ans];
                }
            } else {
                if (A[m] == A[m + 1]) {
                    // first occurrence
                    h = m - 1;
                } else if (A[m] == A[m - 1]) {
                    l = m + 1;
                } else {
                    ans = m;
                    return A[ans];
                }
            }
        }
        return A[ans];
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7};
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.solve(A));
    }
}
