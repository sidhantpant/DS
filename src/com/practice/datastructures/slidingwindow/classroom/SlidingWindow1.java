package com.practice.datastructures.slidingwindow.classroom;

public class SlidingWindow1 {

    private static void addSubarrayWithSlidingWindow(int[] A ,int k){
        int N = A.length;
        int sum = 0 ;
        for (int i = 0; i < k; i++) {
            sum = sum + A[i];
        }
        System.out.println(sum);
        int s = 1;
        int e = k;
        while(e < N){
            sum = sum - A[s-1] + A[e];
            s++;
            e++;
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int[] A = {-3, 4, -2, 5, 3, -2, 8, 2, -1, 4};
        addSubarrayWithSlidingWindow(A ,5);
    }


}
