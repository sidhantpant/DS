package com.practice.datastructures.prefix.assignment;

public class Solution4 {

    /*Given an array A of N integers. Construct prefix sum of the array in the given array itself.
     Problem Constraints :
      1 <= N <= 10^5
      1 <= A[i] <= 10^3 */

    private static int[] solve(int[] A){
        int N = A.length;
        for (int i = 1; i < N; i++) {
            A[i] = A[i-1]+A[i];
        }
        return A;
    }
}
