package com.interview.datastructures.intermediate.sorting.classroom;

import java.util.Arrays;

public class NobleInteger {

    public int nobleIntegerBruteForce(int[] A) {

        int N = A.length;
        int totalCount = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (A[i] > A[j]) {
                    count++;
                }
            }
            if (count == A[i]) {
                totalCount++;
                System.out.print(A[i] + ",");
            }
        }
        return totalCount;
    }

    public int nobleIntegerOptimised(int[] A) {
        int N = A.length;
        Arrays.sort(A);
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == i) {
                System.out.print(A[i] + ",");
                count++;
            }
        }
        return count;
    }

    public int nobleIntegerOp(int[] A) {
        Arrays.sort(A);
        int N = A.length;
        int count = 0;
        for (int i = 0; i < N - 1; i++) {
            while(A[i] == A[i+1] && i < N-1){
                count++;
                i++;
            }
            if(A[i] == i){
                count++;
            }
        }
        return count;
    }

    public int nobleIntegerRepititive(int[] A) {
        int N = A.length;
        Arrays.sort(A);
        int count = 0;
        int totalCount = 0 ;
        if (A[0] == 0) {
            totalCount++;
        }
        for (int i = 1; i < N; i++) {
            if (A[i] != A[i - 1]) {
                System.out.println(A[i]);
                count = i;
            }
            if (A[i] == count) {
                System.out.println(A[i]);
                totalCount++;
            }
        }
        return totalCount;
    }

    public int nobleDescending(int[] A){
        Arrays.sort(A);
        int N = A.length;
        for (int i = 0; i < N; i++) {
            while (i < N-1 && A[i] == A[i+1]){
                i++;
            }
            if(A[i] == N-i-1){
                return 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] A = {-1, -5, 3, 5, -10, 4};
        int[] B = {2, 0, 3, 2,3, 6, 3};
        NobleInteger ni = new NobleInteger();
//        System.out.println(ni.nobleIntegerBruteForce(A));
//        System.out.println(ni.nobleIntegerOptimised(A));
//        System.out.println(ni.nobleIntegerRepititive(B));
//        System.out.println(ni.nobleIntegerRepititive(B));

        int[] M = {3,2,1,3};
        ni.nobleDescending(M);
    }
}
