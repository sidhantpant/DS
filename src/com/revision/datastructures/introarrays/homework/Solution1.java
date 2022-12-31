package com.revision.datastructures.introarrays.homework;

/*Given an array A of size N. You need to find the sum of Maximum and Minimum
 element in the given array.*/
public class Solution1 {

    private static int sumMinMax(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            }
            if (A[i] < min) {
                min = A[i];
            }
        }
        return min + max;
    }

    public static void main(String[] args) {
        int[] A = {-2, 1, -4, 5, 3};
        sumMinMax(A);
    }

}
