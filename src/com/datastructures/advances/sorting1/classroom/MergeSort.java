package com.datastructures.advances.sorting1.classroom;

public class MergeSort {

    static void merge(int[] A, int s, int m, int e) {

        int p1 = s;
        int p2 = m + 1;
        int p3 = 0;

        int[] tmp = new int[e - s + 1];
        while (p1 <= m && p2 <= e) {
            if (A[p1] <= A[p2]) {
                tmp[p3] = A[p1];
                p1 = p1 + 1;
                p3 = p3 + 1;
            } else {
                tmp[p3] = A[p2];
                p2 = p2 + 1;
                p3 = p3 + 1;
            }
        }
        //copy remaining elements
        while (p1 <= m) {
            tmp[p3] = A[p1];
            p1 = p1 + 1;
            p3 = p3 + 1;
        }

        while (p2 <= e) {
            tmp[p3] = A[p2];
            p2 = p2 + 1;
            p3 = p3 + 1;
        }

        int i = s;
        int j = 0;
        while (i <= e) {
            A[i] = tmp[j];
            i++;
            j++;
        }
    }

    static void mergeSort(int[] A, int s, int e) {
        if (s == e) {
            return;
        }
        int m = (s + e) / 2;
        mergeSort(A, s, m);
        mergeSort(A, m + 1, e);
        merge(A, s, m, e);

    }

    public static void main(String[] args) {
        int[] A = {3, 10, 6, 15, 8, 12, 2, 18, 17};
        int s = 0;
        int e = A.length - 1;
        mergeSort(A, s, e);
        System.out.println(A);
    }

}
