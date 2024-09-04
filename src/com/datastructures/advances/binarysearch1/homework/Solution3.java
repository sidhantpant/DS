package com.datastructures.advances.binarysearch1.homework;

import java.util.Arrays;
import java.util.Collections;

public class Solution3 {

    public int solve(int A, int B, int[][] C) {
        int[] N = new int[A];
        int min = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < A; i++) {
            Arrays.sort(C[i]);
        }

        for (int i = 0; i < A-1; i++) {
            int[] X = C[i+1];
            for (int j = 0; j < B-1; j++) {
                int elem = C[i][j];
                int lb =  lowerBound(X,elem);
                int ub = upperBound(X,elem);
                ans = Math.min( ans, Math.min(elem-lb,ub- elem));
            }
            N[i] = min;
        }

        for(int i=0 ; i< N.length-1 ; i++ ){

        }
        return 1;
    }

    public int lowerBound(int[] A,int K){
        int B = A.length;
        int l = 0;
        int h = A.length-1;

        int ans = -1;
        while (l <= h){
            int mid = (l+h)/2;
            if(A[mid] == K){
                return A[mid];
            }
            if(A[mid] < K){
                ans = A[mid];
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return ans;
    }

    public int upperBound(int[] A,int K){
        int B = A.length;
        int l = 0 ;
        int h = B-1;
        int ans = -1;
        while (l <= h){
            int mid = (l+h)/2;
            if(A[mid] == K){
                return A[mid];
            }
            if(A[mid] > K){
                ans = A[mid];
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][]  A= {{7,3},{2,1},{4,9}};
        Solution3 sol = new Solution3();
        sol.solve(3,2,A);
    }
}
