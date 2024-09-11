package com.interview.datastructures.intermediate.slidingwindow.classroom;

public class MinSubArray {

    public int minSubArrays(int[] A,int K){

        //Iteate in first window and find the minimum
        int N = A.length;
        int minSum = 0;
        for(int i = 0 ; i < K ; i++){
            minSum = minSum+A[i];
        }

        //Slide the window of size K and remove first element and add next element with s & e
        int s = 1 ;// next element in the sliding window
        int e = K ;// end element in the sliding window

        int sum = minSum;
        while(e < N){ // slide till end index reach the last element
            sum = sum - A[s-1] + A[e]; // remove previous add next
            minSum = Math.min(sum,minSum);
            s++;
            e++;
        }
        return minSum;
    }

    public static void main(String[] args) {
        int[] A = {-3,4,-2,5,3 ,-2,8,2,-1,4};
        MinSubArray sum = new MinSubArray();
        System.out.println(sum.minSubArrays(A,5));
    }

}
