package com.revision.datastructures.introarrays.homework;

/*
Given an integer array A of size N. In one second, you can increase the value of one element by 1.
Find the minimum time in seconds to make all elements of the array equal.
*/
public class Solution5 {

    private static int timeToEquality(int[] A) {

        int N = A.length;
        int max = Integer.MIN_VALUE;
        int seconds = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        for (int i = 0; i < N; i++) {
            seconds = seconds + (max - A[i]);
        }
        return seconds;
    }

}
