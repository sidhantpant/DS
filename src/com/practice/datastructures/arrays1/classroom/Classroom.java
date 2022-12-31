package com.practice.datastructures.arrays1.classroom;

public class Classroom {

    private static void greaterElements(int[] arr) {
        int N = arr.length;
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                    break;
                }

            }
        }
        System.out.println(count);
    }

    private static void findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element " + max);

    }

    private static void findCount(int[] arr, int max) {
        int count = 0;
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (arr[i] == max) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static void countMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (arr[i] == max) {
                count++;
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int greaterThenItself = N - count;
        System.out.println("Greatest " + greaterThenItself);

    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 8, 0, 8, 1, 3, 8};
        greaterElements(arr);
        findMax(arr);
        findCount(arr, 8);
        countMax(arr);
    }

}
