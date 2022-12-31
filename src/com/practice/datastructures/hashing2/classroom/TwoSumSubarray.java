package com.practice.datastructures.hashing2.classroom;

import java.util.ArrayList;
import java.util.List;

public class TwoSumSubarray {

    private static int[] twoSumSubarray(int[] A, int K) {
        int N = A.length;
        int[] PS = new int[N + 1];
        PS[0] = 0;
        for (int i = 1; i < N + 1; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }
        List<Integer> differenceList = new ArrayList<>();
        int[] subArray = new int[2];
        for (int i = 1; i < N + 1; i++) {
            int sum = 0;
            for (int j = i; j < N + 1; j++) {
                sum = PS[j] - PS[i - 1];
                if (sum == K) {
                    subArray[0] = i;
                    subArray[1] = j;
                    return subArray;
                }
            }
        }
        differenceList.add(-1);
        int[] sub = new int[differenceList.size()];
        for (int i = 0; i < differenceList.size(); i++) {
            sub[i] = differenceList.get(i);
        }
        return sub;
    }

    public static void main(String[] args) {
        int[] A1 = {5, 10, 20, 100, 105};
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(twoSumSubarray(A, 19));
    }

}
