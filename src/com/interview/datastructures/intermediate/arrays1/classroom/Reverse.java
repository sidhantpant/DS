package com.interview.datastructures.intermediate.arrays1.classroom;

public class Reverse {

    public int[] reverseWhile(int[] A, int B, int C) {

        int i = B;
        int j = C;

        while (i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        return A;

    }

    public int[] reverseForLoop(int[] A, int B, int C) {
        int N = A.length;
        int l = ((C - B) / 2)+1;
        for (int i = B; i < l; i++) {
            int temp = A[i];
            A[i] = A[N - 1 - i];
            A[N - 1 - i] = temp;
        }
        return A;

    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        Reverse rev = new Reverse();
        rev.reverseWhile(A,2,3);
        rev.reverseForLoop(A,2,3);
    }

}
