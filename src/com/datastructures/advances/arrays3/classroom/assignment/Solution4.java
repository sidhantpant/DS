package com.datastructures.advances.arrays3.classroom.assignment;

public class Solution4 {

    public static int trap(final int[] A) {

        int N = A.length;
        int Area = 0;
        for (int i = 1; i < N; i++) {

            int MaxLeft = A[i];
            int MaxRight = A[i];

            for (int x = 0; x < i; x++) {
                MaxLeft = Math.max(MaxLeft, A[x]);
            }
            for (int x = i + 1; x < N; x++) {
                MaxRight = Math.max(MaxRight, A[x]);
            }
            System.out.print("MaxLeft" + MaxLeft);
            System.out.print("--MaxLeft" + MaxRight);
            System.out.print("--A[i]" + A[i]);
            System.out.println();
            int area = Math.min(MaxLeft, MaxRight) - A[i];
            if (area > 0) {

                Area += area;
            }
        }
        return Area;
    }

    public static int maxWater(int[] arr, int n) {
        // To store the maximum water
        // that can be stored
        int res = 0;

        // For every element of the array
        // except first and last element
        for (int i = 1; i < n - 1; i++) {

            // Find maximum element on its left
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }

            // Find maximum element on its right
            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }
            System.out.print("MaxLeft" + left);
            System.out.print("--MaxLeft" + right);
            System.out.print("--A[i]" + arr[i]);
            System.out.println();

            // Update maximum water value
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }

    private static int maxWaterPrefix(int[] A) {
        int N = A.length;
        int Area = 0;
        int[] PS = new int[N];
        PS[0] = A[0];
        for (int i = 1; i < N ; i++) {
            PS[i] = Math.max(PS[i - 1] , A[i]);
        }

        int[] SS = new int[N];
        SS[N-1] = A[N-1];
        for (int i = N-2; i >= 0 ; i--) {
            SS[i] = Math.max(SS[i+1],A[i]);
        }

        for (int i = 0; i < N; i++) {
            Area += (Math.min(PS[i],SS[i]) - A[i]);
        }
        return Area;
    }

    public static void main(String[] args) {
        int[] A = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//        System.out.println(trap(A));
        System.out.println("========");
        System.out.println(maxWater(A, A.length));
        System.out.println(maxWaterPrefix(A));
    }


}

