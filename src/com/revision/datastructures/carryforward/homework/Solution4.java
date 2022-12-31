package com.revision.datastructures.carryforward.homework;

/*
Decide whether it is possible to divide the array into one or more subarrays of even length such that the first and last element of all subarrays will be even.
Return "YES" if it is possible; otherwise, return "NO"
*/
public class Solution4 {

    private static String evenSubarrays(int[] A) {

        int N = A.length;
        int first = A[0];
        int last = A[N - 1];
        int even = N % 2;
        //check if first element is even,last is even and  size is even
        //treat complete array as subarray

        if (first == 0 && last == 0 && even == 0) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 8, 6};
        System.out.println(evenSubarrays(A));
    }

}
