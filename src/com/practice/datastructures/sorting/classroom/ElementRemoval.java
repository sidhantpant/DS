package com.practice.datastructures.sorting.classroom;

import java.util.Arrays;
import java.util.Collections;

public class ElementRemoval {

    private static int elementRemoval(int[] A){

        int N = A.length;
        int ans = 0;
        Arrays.sort(A); // 1 2 4
        reverse(A); // 4 2 1
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum = sum+A[j];
            }
           ans = ans + sum;
        }
        return ans;
    }

    private static int elementRemovalOptimisedContribution(int[] A){

        int N = A.length;
        Arrays.sort(A);
        reverse(A);

        int ans = 0 ;
        for (int i = 0; i < N; i++) {
            int count = i+1; // contribution of each element
            ans = ans + A[i]* count;
        }
        return ans;
    }

    private static void reverse(int[] A){
        int N = A.length;
        for (int i = 0; i < N/2; i++) {
            int temp = A[i];
            A[i] = A[N-1-i];
            A[N-1-i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] A= {2,1,4};
//        System.out.println(elementRemoval(A));
        int[] A1= {2,1,4};
        System.out.println(elementRemovalOptimisedContribution(A1));
    }
}
