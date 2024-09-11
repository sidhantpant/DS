package com.interview.datastructures.intermediate.sorting.assignment;

import java.util.Arrays;
import java.util.Collections;

public class ArithmeticProgression {

    public boolean arithmeticProgression(int[] A){
        Arrays.sort(A);
        int N = A.length;
        int diff = A[1] - A[0];
        for (int i = 1; i < N-1; i++) {
            if((A[i+1] - A[i]) != diff){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = {3, 5, 1,2};
        ArithmeticProgression ap = new ArithmeticProgression();
        System.out.println(ap.arithmeticProgression(A));
    }
}
