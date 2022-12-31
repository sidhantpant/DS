package com.practice.datastructures.bitmanipulation.homework;

public class Solution3 {

    private static long bitwise(int A, int[] B) {

        int count =0 ;
        for (int i = 0; i < A; i++) {
            int ans = 0;
            for (int j = i; j < A; j++) {
                ans = ans ^ B[j];
                System.out.print(ans + " ");
                if(ans == 1){
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("count "+count);
        return count;
    }

    public static void main(String[] args) {
        int[] A = { 0, 1, 1, 0, 1};
        System.out.println(bitwise(5, A));
    }
}
