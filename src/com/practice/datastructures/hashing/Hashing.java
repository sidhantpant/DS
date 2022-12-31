package com.practice.datastructures.hashing;

public class Hashing {

    public static void checkArray(int[] A, int[] Q) {
        for (int i = 0; i < Q.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i] == Q[j]) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {2, 5, 6, 7, 8, 9};
        int[] Q = {5, 1, 2, 6};
        checkArray(A, Q);
    }


}
