package com.practice.datastructures.bitmanipulation2.assignment;

public class Solution3 {

    private int solve(int A,int B){
        int X,Y;
        X = 1 << A; // 0000001 -> 000000
        Y = 1 << B;
        return X|Y;
    }
}
// 0 1 2 3
