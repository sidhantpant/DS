package com.interview.datastructures.intermediate.arrays1.homework;

public class SecondLargest {

    public static void main(String[] args) {
        int[] A = {13, 7, 16, 18, 14, 17, 18, 8, 10};
        SecondLargest sec = new SecondLargest();
//        sec.secondLargest(A);
        sec.solve(A);
    }

    public int secondLargetEasiestApproach(int[] A) {

        int N = A.length;
        int index = 0;
        int max = A[0];

        // if only one element is present in the array
        if(A.length == 1){
            return -1;
        }

        for (int i = 0; i < N; i++) {
            if (A[i] >= max) {
                max = A[i];
                index = i;
            }
            swap(A, 0, index);
        }
        for (int i = 1; i < N; i++) {
            if (A[i] >= max) {
                max = A[i];
            }
        }
        return max;
    }

    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public int solve(int[] A) {
        int first_Max = A[0];
        int second_Max = Integer.MIN_VALUE;
        int N = A.length;
        if (A.length == 1) {
            return -1;
        }
        for (int i = 1; i < N; i++) {

            if (A[i] > first_Max) {
                second_Max = first_Max;
                first_Max = A[i];
            } else if (A[i] >= second_Max) {
                second_Max = A[i];
            }
        }
        return second_Max;
    }

    public int secondLargest(int[] A) { // 2 5 1 6 9 11
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            if (A[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = A[i];
            } else if (A[i] != firstLargest && A[i] > secondLargest) {
                secondLargest = A[i];
            }
        }
        return secondLargest;
    }

    //sometimes you need to work on easy solutions as well.Find the max element in first iteration and
    // in next iteration check if it is now equal and fir max element.
    public int secondLargestOptimised(int[] A) {
        int first_Max = Integer.MIN_VALUE;
        int second_Max = -1;


        int N = A.length;
        for (int i = 0; i < N; i++) {
            first_Max = Math.max(first_Max, A[i]);
        }

        for (int i = 0; i < N; i++) {
            if (A[i] != first_Max) {
                second_Max = Math.max(A[i], second_Max);
            }
        }
        return second_Max;
    }

}
