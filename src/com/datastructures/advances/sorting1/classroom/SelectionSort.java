package com.datastructures.advances.sorting1.classroom;

import com.datastructures.advances.heaps2.KSmallestELement;

public class SelectionSort {

    static void selectionSort(int[] A){
        int N = A.length;
        for (int i = 0; i < N; i++) {
            int min = A[i];
            int index = i ;
            for (int j = i; j < N; j++) {
                if(A[j] < min){
                    min = A[j];
                    index = j;
                }
            }
            swap(A,index,i);
        }
        System.out.println(A);
    }

    static void swap(int[] A,int first,int second){
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;
    }

    public int kthsmallest(final int[] A, int B) {

        int N = A.length;
        for(int i =0 ; i < B ;i++){
            int index = i;
            int min = A[i];
            for(int j = i ; j < N ;j++){
                if (A[j] < A[i]){
                    min = A[j];
                    index = j;
                }
            }
            swap(A,i,index);
        }
        return A[B-1];
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 4, 3, 2,1};
        SelectionSort sort = new SelectionSort();
        sort.kthsmallest(A,3);
        selectionSort(A);
    }
}
