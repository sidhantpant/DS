package com.datastructures.advances.sorting1.classroom;

public class PreMergeSortIndices {
    //sort within A
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
        // copy the remaining elements
        while (p1 <= m) {
            tmp[p3] = A[p1];
            p1 = p1 + 1;
            p3 = p3 + 1;
        }
        while (p2 <= e) {
            tmp[p2] = A[p2];
            p2 = p2 + 1;
            p3 = p3 + 1;
        }

        //copy temp array to original array
//        int i = s;
//        int j = 0;
//        while (i <= e) {
//            A[i] = tmp[j];
//            i++;
//            j++;
//        }
        int j=0;
        while(s<=e){
           A[s] = tmp[j];
           s++;
           j++;
        }
        System.out.println(A);
    }

    public static void main(String[] args) {
        int[] A = {4,8,-1,2,6,9,11,3,4,7,13,0};
        merge(A ,2,6,9);
    }
}
