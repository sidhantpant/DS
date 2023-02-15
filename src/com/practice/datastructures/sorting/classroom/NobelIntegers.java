package com.practice.datastructures.sorting.classroom;

import java.util.Arrays;

public class NobelIntegers {

    static int nobelIntegerBruteForce(int[] A){
        int N = A.length;
        int ans=0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if(A[i] > A[j]){
                    count++;
                }
            }
            if(count == A[i]){
                ans++;
            }
        }
        return ans;
    }

    static int nobelIntegersUnique(int[] A){
        int N = A.length;
        int ans = 0 ;
        Arrays.sort(A);
        for (int i = 0; i < N; i++) {
            if(A[i] == i){
                ans++;
            }
        }
        return ans;
    }
    private static int nobelIntegerRepetitive(int[] A) {

        int N = A.length;
        Arrays.sort(A);
        int c = 0;
        int ans = 0;
        if(A[0]==0){
            ans=1;
        }
        for (int i = 1; i < N; i++) {

            if(A[i-1] != A[i]){ // check if is coming for the first time
                c=i;
            }
            if(A[i] == c){
                ans = ans+1;
            }
        }
        return ans == 1 ? ans : -1;


      //  return ans;
    }


    private static int nobleCount(int[] A){

        Arrays.sort(A);
        int N = A.length;
        int count = 0;
        for (int i = 0; i < N-1; i++) {
            if(A[i] == A[i+1]){
                continue;
            }
            if(A[i] == N-i-1){
                count++;
            }
        }
        return count;


    }

    public static void main(String[] args) {
//        int[] A = {-1, -5, 3,3, 5, -10, 4}; // -10 -5 -1 3 4 5
        int[] A = {-3,0,2,2,5,5,5,5,8,8,10,10,10,14}; // -10 -5 -1 3 4 5
       // System.out.println(nobelIntegersUnique(A));
        System.out.println(nobelIntegerRepetitive(A));
//        System.out.println(nobelIntegerBruteForce(A));
//        int[] A1 = {0, 2, 2, 3, 3, 5};
//        System.out.println(nobelIntegerDuplicate(A1));
//
//        int[] A2 = {10, 2, 2, 3, 3, 5};
//        System.out.println(nobleCount(A2));
    }
}
