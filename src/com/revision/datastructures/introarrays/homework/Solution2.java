package com.revision.datastructures.introarrays.homework;

/*
Given an array A and an integer B, find the number of occurrences of B in A.
*/
public class Solution2 {

    public int occurenceElement(int[] A, int B) {
        int count = 0;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            if (A[i] == B) {
                count++;
            }
        }
        return count;
    }
}
