package com.datastructures.advances.binarysearch1.homework;

public class RotatedArray {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final int[] A, int B) {
        int N = A.length;
        int K = N ;
        int l = 0 ;
        int h = N-1;
        int ans = -1;
        //first get the min element index i.e K (no of times array is rotated)
        while(l<=h){
            int mid = l+(h-l)/2;
            if(A[0] > A[mid]){
                K = A[mid];
                h = mid-1;
            }else {
                l = mid+1;
            }
        }
        if(A[0] < B){
            //search in left side
            l = 0;
            h = K-1;
            while(l <= h){
                int mid = l+(h-l)/2;
                if( A[mid] == B ){
                    ans = mid;
                }
                if( A[mid] < B){
                    l = mid+1;
                }else{
                    h = mid-1;
                }
            }
        }else{
            //search in right side
            l = K+1;
            h = N-1;
            while(l <= h){
                int mid = l+(h-l)/2;
                if(A[mid] == B){
                    ans = mid;
                }
                if(A[mid] < B){
                    l = mid+1;
                }else{
                    h = mid-1;
                }
            }
        }
        return ans;
    }
}
