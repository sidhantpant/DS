package com.practice.datastructures.subarrays.classroom;

public class PrintSubArray {

    private static void printSubArray(int[] A, int s, int e) {
        int N = A.length;
        for (int i = s; i <= e; i++) {
            System.out.println(A[i]);
        }
    }

    private static int addSubArray(int[] A,int s ,int e){
        int N = A.length;
        int sum = 0;
        for (int i = s; i <= e; i++) {
            sum = sum + A[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8, 10, 12};
        printSubArray(A, 2, 5);
        addSubArray(A, 2, 5);
    }

}
