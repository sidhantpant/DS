package com.interview.datastructures.arrays1.classroom;

public class RotateArrayKTimes {

    public void rotateKTimesRights(int[] A, int K) {
        int N = A.length;

        while (K > 0) {
            int temp = A[N - 1];
            for (int i = N - 1; i > 0; i--) {
                A[i] = A[i - 1];
            }
            A[0] = temp;
            K--;
        }
        System.out.println(A);
    }

    public void rotateKTimesRight(int[] A, int K) {
        int N = A.length;

        for (int i = 0; i < K; i++) {
            int temp = A[N - 1];
            for (int j = N - 1; j > 0; j--) {
                A[j] = A[j-1];
            }
            A[0] = temp;
        }
        System.out.println(A);
    }


    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        RotateArrayKTimes rot = new RotateArrayKTimes();
        //rot.rotateKTimesRights(A, 4);
        rot.rotateKTimesRight(A,4);
    }
}
