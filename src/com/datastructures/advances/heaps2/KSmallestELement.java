package com.datastructures.advances.heaps2;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KSmallestELement {


    void selectionSortKSmallest(int[] A,int K){

        int N = A.length;
        for (int i = 0; i < K; i++) {
            int min = A[i];
            int index = i;
            for (int j = i; j < N ; j++) {
                if(A[j] < min){
                    min = A[j];
                    index = j;
                }
            }
            swap(A,i,index);
        }

    }

    void insertMinHeapInCBT(int[] arr, int data){
        int N = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < data; i++) {
            pq.add(arr[i]);
        }
        for (int i = data; i < N ; i++) {
            int elem = arr[i];
            int max = pq.peek();
            if(elem > max){
                pq.remove(max);
                pq.add(data);
            }
        }


    }

    static void swap(int[] A,int first,int second){
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;
    }

}
