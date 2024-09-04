package com.datastructures.advances.binarysearch1.homework;

import java.util.Arrays;

public class MinimumDifference {

    public int solve(int A, int B, int[][] C) {
        int[] N = new int[A];
        int min = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < A; i++) {
            Arrays.sort(C[i]);
        }

        for (int i = 0; i < A - 1; i++) {
            int[] X = C[i + 1];
            for (int j = 0; j < B ; j++) {
                int elem = C[i][j];
                int lb = lowerBound(X, elem);
                int ub = upperBound(X, elem);
                ans = Math.min(ans, Math.abs(Math.min(elem - lb, ub - elem)));
            }
        }
        return ans;

    }

    public int lowerBound(int[] A, int K) {
        int B = A.length;
        int l = 0;
        int h = A.length - 1;
        if (B < 1) {
            return -1;
        }
        if (A[B - 1] < K) {
            return A[B - 1];
        }
        int ans = Integer.MIN_VALUE;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (A[mid] == K) {
                return A[mid];
            }
            if (A[mid] < K) {
                ans = A[mid];
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }

    public int upperBound(int[] A, int K) {
        int B = A.length;
        int l = 0;
        int h = A.length - 1;
        int ans = Integer.MAX_VALUE;
        if (A[0] > K) {
            return ans;
        }
        while (l <= h) {
            int mid = (l + h) / 2;
            if (A[mid] == K) {
                return A[mid];
            }
            else if(A[mid]< K){
                l=mid+1;
            }else{
                ans = A[mid];
                h = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[][] A = {{8,4},{6,8}};
        MinimumDifference minimumDifference = new MinimumDifference();
        minimumDifference.solve(2,2,A);
    }

}
