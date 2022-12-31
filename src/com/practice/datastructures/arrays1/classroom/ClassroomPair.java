package com.practice.datastructures.arrays1.classroom;

public class ClassroomPair {

    private static int countPairsLoop(int[] arr,int k){

        int count = 0;
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i!=j){

                    if(arr[i]+arr[j] == k){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static int countPairsUpperQuadrant(int[] arr, int K) {
        int count = 0;
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] + arr[j] == K) {
                    count++;
                }
            }
        }
        return count * 2;

    }

    private static int countPairsLowerQuadrant(int[] arr,int K){
        int count = 0;
        int N = arr.length;
        for (int i = N-1 ; i > 0; i--) {
            for (int j = i-1 ; j >=0 ; j--) {
                if(arr[i]+arr[j]==K){
                     count++;
                }
            }
        }
        return count*2;

    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, -3, 7, 8, 15, 6, 13};
        System.out.println(countPairsUpperQuadrant(arr, 10));
        System.out.println(countPairsLowerQuadrant(arr, 10));
        int[] arr1 = {1,2,3,4};
        System.out.println(countPairsLoop(arr1,7));
    }

}
