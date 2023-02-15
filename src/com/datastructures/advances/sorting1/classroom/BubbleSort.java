package com.datastructures.advances.sorting1.classroom;

public class BubbleSort {

    static void bubbleSort(int[]  A){
        int N = A.length;
        for (int i = 0; i < N; i++) {
            int c=0;
            for (int j = 0; j < N-1; j++) {
                if(A[j] > A[j+1]){
                    swap(A,j,j+1);
                    c = c+1;
                }

            }
            if(c==0){
                break;
            }

        }
        System.out.println(A);
    }

    static void swap(int[] A ,int first ,int second){
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;

    }

    public static void main(String[] args) {
//        int[] A = {2,8,5,-1,6,7,4,10,-1};
        int[] A = {3,1,6,10,8};
        bubbleSort(A);
    }
}
