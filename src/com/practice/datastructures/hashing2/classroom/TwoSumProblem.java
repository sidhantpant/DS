package com.practice.datastructures.hashing2.classroom;

import java.util.HashSet;
import java.util.Set;

public class TwoSumProblem {

    private static boolean twoSumBruteForce(int[] A, int K) {

        int N = A.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] + A[j] == K) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean twoSumOptimisedFailed(int[] A, int K) {
        // this will fail for conditions like i!=j.e.b 14 ,(14-7=7) will be present in set and returns true
        // 2 7 11 15 15
        int N = A.length;
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            integerSet.add(A[i]);
        }
        for (int i = 0; i < N; i++) {
            if (integerSet.contains(K - A[i])) {
                return true;
            }
        }
        return false;
    }

    private static boolean twoSumOptimisedPassing(int[] A, int K) {
        // 1 15 7 11 2 15  =>13
        int N = A.length;
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if (integerSet.contains(K - A[i])) {
                return true;
            }
            integerSet.add(A[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {2, 7, 11, 15, 15};
//        System.out.println(twoSumBruteForce(A, 14));

        //failed in this case if sum is 2*A[i],but will pass in case of duplicate
        System.out.println(twoSumOptimisedFailed(A, 22));
        System.out.println(twoSumOptimisedPassing(A,17));
    }

}
