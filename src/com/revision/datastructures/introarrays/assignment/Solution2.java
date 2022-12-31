package com.revision.datastructures.introarrays.assignment;

/*Given an array A and an integer B. A pair(i, j) in the array is a good pair
if i != j and (A[i] + A[j] == B).Check if any good pair exist or not.*/
public class Solution2 {

    private static int countPairsBruteForce(int[] A, int K) {

        int N = A.length;
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] + A[j] == K) {
                    count++;
                }
            }
        }
        return count * 2;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int count =countPairsBruteForce(A,7);
        System.out.println(count);
    }

}
