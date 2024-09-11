package com.interview.datastructures.intermediate.slidingwindow.classroom;

public class MovingAverageSubArray {

    public void movingAverageSubArray(int[] A,int K){


        int N = A.length;
        int sum = 0 ;
        // calculate average for the first window
        for(int i = 0 ; i < K ;i++){
            sum = sum+A[i];
        }
        int avg = sum/K;
        System.out.println(avg);

        // calculate the average for the sliding window
        int s = 1;
        int e = K;
        while(e < N){//check the end e reaches the last element
            sum = sum - A[s-1] +A[e]; // remove prev elem from sliding window and add next element
            avg = sum/K;  // do the avg for each sliding windoe
            System.out.println(avg);
            s++;
            e++;
        }
    }

    public static void main(String[] args) {
        int[] A = {-3,4,-2,5,3 ,-2,8,2,-1,4};
        MovingAverageSubArray avg = new MovingAverageSubArray();
        avg.movingAverageSubArray(A,5);
    }
}
