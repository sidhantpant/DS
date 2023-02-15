package com.datastructures.advances.sorting1.classroom;

public class SmallestElement {

    static int KSmallestElement(int[] A, int K) {

        int N = A.length;
        for (int i = 0; i < N; i++) {
            int min = A[i];
            int index = i;
            for (int j = i; j < N; j++) {
                if (A[j] < min) {
                    min = A[j];
                    index = j;
                }
            }
            swap(A, index, i);
        }
        return A[K-1];
    }

    static void swap(int[] A, int first, int second) {
        int temp = A[first];
        A[first]= A[second];
        A[second] = temp;
    }

    public static void main(String[] args) {
        int[] A = {2,8,5,-1,6,7,4,10,-1};
        System.out.println(KSmallestElement(A, 1));
    }
}
