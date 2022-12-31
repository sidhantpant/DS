package com.revision.datastructures.carryforward.homework;

/*
A wire connects N light bulbs.
Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.
Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
You can press the same switch multiple times.
Note: 0 represents the bulb is off and 1 represents the bulb is on.
*/
public class Solution7 {

    private static int openBulbsBruteForce(int[] bulbs) {

        int count = 0;
        int N = bulbs.length;
        for (int i = 0; i < N; i++) {
            if (bulbs[i] == 0) {
                count++;
                for (int j = i; j < N; j++) {
                    bulbs[i] = 1 - bulbs[i];
                }
            }
        }
        return count;
    }

    private static int openBulbsOptimised(int[] A) {

        int count = 0;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            int initial_state = A[i];
            int current_state;
            if (count % 2 == 0) {
                current_state = initial_state; // do nothing
            } else {
                current_state = 1 - initial_state; // just flip the bulb
            }
            if (current_state == 0) {
                count = count + 1;
            }
        }
        return count;


    }

    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1};
        int[] A1 = {0, 1, 0, 1};
        System.out.println(openBulbsBruteForce(A));// 1 0 1 0 // 1 1 0 1 // 1 1 1 0 // 1 1 1 1 //
//        System.out.println(openBulbsOptimised(A1));// a new array is passed bcz its values are changes in prev function
    }
}
