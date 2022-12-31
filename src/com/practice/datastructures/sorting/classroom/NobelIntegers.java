package com.practice.datastructures.sorting.classroom;

import java.util.Arrays;

public class NobelIntegers {

    private static int nobelIntegersUnique(int[] A) {

        int N = A.length;
        Arrays.sort(A);
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == i) {
                count = count + 1;
            }
        }
        return count;
    }

    private static int nobelIntegerDuplicate(int[] A) {

        int N = A.length;
        Arrays.sort(A);
        int count = 0;
        if (A[0] == 0) {
            count++;
        }
        int prev =0;
        for (int i = 1; i < N-1 ; i++) {
            if(A[i] == A[i+1]){
                continue;
            }else{
                if(A[i] == i){
                    count++;
                }
            }

        }
        return count;

    }

    private static int nobleCount(int[] A){

        Arrays.sort(A);
        int N = A.length;
        int count = 0;
        for (int i = 0; i < N-1; i++) {
            if(A[i] == A[i+1]){
                continue;
            }
            if(A[i] == N-i-1){
                count++;
            }
        }
        return count;


    }

    public static void main(String[] args) {
        int[] A = {-1, -5, 3, 5, -10, 4}; // -10 -5 -1 3 4 5
        System.out.println(nobelIntegersUnique(A));
        int[] A1 = {0, 2, 2, 3, 3, 5};
        System.out.println(nobelIntegerDuplicate(A1));

        int[] A2 = {10, 2, 2, 3, 3, 5};
        System.out.println(nobleCount(A2));
    }
}
