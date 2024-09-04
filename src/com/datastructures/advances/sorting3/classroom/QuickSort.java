package com.datastructures.advances.sorting3.classroom;

import com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl;

public class QuickSort {

    int rearrangeEntireArray(int[] A) {
        int N = A.length;
        int p1 = 1;
        int p2 = N - 1;
        while (p1 <= p2) {
            if (A[p1] <= A[0]) {
                p1++;
            } else if (A[p2] > A[0]) {
                p2--;
            } else {
                swap(A, p1, p2);
                p1++;
                p2--;
            }
        }
        swap(A, 0, p2);
        return p2;
    }

    int rearrangeSubarray(int[] A, int s, int e) {
        int p1 = s + 1;
        int p2 = e;
        while (p1 <= p2) {
            if (A[p1] <= A[s]) {
                p1 = p1 + 1;
            } else if (A[p2] > A[s]) {
                p2 = p2 - 1;
            } else {
                swap(A, p1, p2);
                p1++;
                p2--;
            }
        }
        swap(A, s, p2);
        return p2;

    }

    void quickSort( int[] A ,int s,int e){

        if(s>=e){
            return ;
        }
        int p = rearrangeSubarray(A,s,e);
        quickSort(A , s,p-1);
        quickSort(A,p+1,e);

    }

    void swap(int[] A, int p1, int p2) {
        int temp = A[p1];
        A[p1] = A[p2];
        A[p2] = temp;
    }

    public static void main(String[] args) {
        int[] A = {10, 2, 6, 11, 5, 19, 18, 5};// 2 5 5 6 10 11 18 19
        int N = A.length;
        QuickSort quickSort = new QuickSort();
//        System.out.println(quickSort.rearrangeEntireArray(A));
//        System.out.println(quickSort.rearrangeSubarray(A, 2, 6));
        quickSort.quickSort(A,0,N-1);
        System.out.println(A);

    }

}
