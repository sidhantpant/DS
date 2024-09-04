package com.revision.datastructures.slidingwindow.classroom;

//Given an array  of size N & number B. Return minimum number of swaps required to bring
//all elements less than equal to B together
public class Solution1 {

    private static void bringElementsTogether(int[] A, int B) {
        int N = A.length;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] <= B) {
                count++;
            }
        }
        int minSwaps = Integer.MAX_VALUE;
        for (int i = 0; i < N- count; i++) {//5, 17,100,11
            int swapCount = 0;
            for (int j = i; j < count+i; j++) {
                if (A[j] > B) {
                    swapCount++;
                }
            }
            minSwaps = Math.min(minSwaps, swapCount);
        }
        System.out.println(minSwaps);
    }

    static int bringElementsSlidingWindow(int[] A,int B){

        int N = A.length;
        int countMin = 0 ;
        //get the size of window first
        for(int i=0 ;i < N ; i++){
            if(A[i] <= B){
                countMin++;
            }
        }

        //iterate over first window
        int count = 0 ;
        for (int i = 0; i < countMin; i++) {
            if(A[i] > B){
                count++;
            }
        }

        int s = 1;
        int e = countMin;
        int minSwap = Integer.MAX_VALUE;

        while( e < N){
            if(A[s-1] > B){
                count = count -1;
            }
            if(A[e] > B){
                count = count+1;
            }
            minSwap = Math.min(minSwap,count);
            s++;
            e++;

        }
        if(minSwap == Integer.MAX_VALUE){
            minSwap = 0;
        }
        return minSwap;
    }

    public static void main(String[] args) {
        int[] A = {1, 12, 10, 3, 14, 10, 5};
        int[] A1 = { 5, 17,100,11};
//        bringElementsTogether(A, 8);
        bringElementsTogether(A1, 20);
        System.out.println(bringElementsSlidingWindow(A1, 20));
    }

}
