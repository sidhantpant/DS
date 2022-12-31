package com.practice.datastructures.hashing.classroom;

import java.util.Scanner;

public class NumberPresent {

    private static void checkPresence(int[] A, int Q) {

        Scanner scanner = new Scanner(System.in);
        int M = A.length;
        for (int i = 0; i < Q; i++) {
            boolean isPresent = false;
            int val = scanner.nextInt();
            for (int j = 0; j < M; j++) {
                if (A[j] == val) {
                    isPresent = true;
                    break;
                }
            }
            System.out.println(isPresent);
        }
    }





    public static void main(String[] args) {
        int[] A = {3, 15, 6, 2, 7, 8, 1, 9};
        int[] Q = {1, 13, 27, 9};
        checkPresence(A, 5);
    }

}
