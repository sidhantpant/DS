package com.practice.datastructures;

import java.util.HashMap;

public class HelloWorld {


    public static int check(int[] arr) {
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int num = arr[i];
            if (num % 2 == 0 && num != 0) {
                maxNum = Math.max(maxNum, num);
            } else if (num != 0 && num % 2 != 0) {
                minNum = Math.min(minNum, num);
            }
        }
        return maxNum - minNum;

    }

    public static int sum(int[] arr, int b) {

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= arr.length - 1; i++) {

            int firstPair = arr[i];
            int secPair = b - arr[i];
            if (map.containsKey(secPair)) {
                count += map.get(secPair);
            }
            if (map.containsKey(firstPair)) {
                map.put(firstPair, map.get(firstPair) + 1);
            } else {
                map.put(firstPair, 1);
            }
        }
        return count;


    }

    public static int pow(int A, int B) {
        if (B == 1) {
            return A;
        }
        int num = pow(A, B - 1);

        return A * num;
    }

    public static int subArray(int[] arr) {
        int total = 0;
        int neg = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] >= 0) {
                total = total + arr[i];
            } else if (arr[i] <= 0) {
                neg = neg + arr[i];

            }
            if (total + neg == 0) {
                return 1;
            }
        }
        return 0;
    }

    public static int[] solve(int[] A, int[] B) {
        int[] C = new int[A.length];
        for (int i = 0; i <= A.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] == B[j]) {
                    C[i] = A[i];
                }
            }
        }
        return C;


    }



    public int missingNumber(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {

            int mid = high + low / 2;
            if (arr[mid] - mid == arr[0]) {
                if (arr[mid + 1] - arr[mid] > 1) {
                    return arr[mid + 1];
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] - arr[mid - 1] > 1) return arr[mid - 1];
                else high = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println("hello world");
        int[] arr = {-98, 54, -52, 15, 23, -97, 12, -64, 52, 85};
        int[] arr1 = {1, 2};
        int[] arr2 = {5};
//        sum(arr1,5);
        //      System.out.println(sum(arr1,5));
//        check(arr1);
//        System.out.println(pow(2,3));
//        System.out.println(Math.pow(-1,1)%20);
//        System.out.println(solve(arr1, arr2));
    }
}
