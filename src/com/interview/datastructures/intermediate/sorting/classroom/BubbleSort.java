package com.interview.datastructures.intermediate.sorting.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BubbleSort<T,R> {

    public void bubbleSort(int[] A){
        int N = A.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1; j++) {
                if(A[j] < A[j+1]){
                    swap(A, j ,j+1);
                }
            }
        }
    }

    public void bubbleSortDesc(int[] A){
        int N = A.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1 ; j++) {
                if(A[j] < A[j+1]){
                    swap(A,j,j+1);
                }
            }
        }
    }



    public void swap(int[] A , int i , int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] A = {4,8,6,2,3,10};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(A);
    }

}
