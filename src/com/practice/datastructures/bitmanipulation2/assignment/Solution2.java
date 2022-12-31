package com.practice.datastructures.bitmanipulation2.assignment;

public class Solution2 {

    private int solve(int A,int B){
        int X,Y;
        X = 1 << A; // 0000001 -> 000000
        Y = 1 << B;
        return X|Y;


    }
}
