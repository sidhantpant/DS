package com.interview.datastructures.intermediate.sorting.assignment;

import java.util.Arrays;

public class FactorsSort {

    public static void main(String[] args) {
        int A = 30;
        FactorsSort fs = new FactorsSort();
        System.out.println(fs.calculateFactors(A));
        int[] B = {6, 8, 9};
        fs.countFactors(B);
    }

    public int[] countFactors(int[] A) {
        int N = A.length;
        Integer[] integerArray = new Integer[N];
        for (int i = 0; i < N; i++) {
            integerArray[i] = A[i];
        }
        Arrays.sort(integerArray, (o1, o2) -> {
            int fa = calculateFactors(o1);
            int fb = calculateFactors(o2);

            if (fa < fb) {
                return -1;
            } else if (fa > fb) {
                return 1;
            } else {
                return 0;
            }
        });
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = integerArray[i];
        }
        return B;
    }

    public int calculateFactors(int A) {
        int countFactors = 0;
        for (int i = 1; i <= Math.sqrt(A); i++) {
            if (i == A / i) {
                countFactors = countFactors + 1;
            } else if (A % i == 0) {
                countFactors = countFactors + 2;
            }
        }
        return countFactors;
    }
}
