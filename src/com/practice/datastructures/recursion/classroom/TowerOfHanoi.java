package com.practice.datastructures.recursion.classroom;

public class TowerOfHanoi {

    void towerOfHanoi(int N, char S, char T, char D) {
        towerOfHanoi(N - 1, S, D, T);
        towerOfHanoi(N - 1, D, S, T);
        System.out.println("Movement from " + S + " to " + D);
        towerOfHanoi(N - 1, S, D, T);
    }

    public static void main(String[] args) {

    }


}
