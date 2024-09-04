package com.practice.datastructures.interviewproblem2.homework;

public class MajorityElement3N {

    int majorityElements3N(int[] A){

        int n = A.length;
        int count1 = 0, count2 = 0;
        int first =  Integer.MIN_VALUE;;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (first == A[i])
                count1++;
            else if (second == A[i])
                count2++;
            else if (count1 == 0) {
                count1++;
                first = A[i];
            }
            else if (count2 == 0) {
                count2++;
                second = A[i];
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] == first)
                count1++;
            else if (A[i] == second)
                count2++;
        }

        if (count1 > n / 3)
            return first;

        if (count2 > n / 3)
            return second;

        return -1;

    }

    public int repeatedNumber(int[] A) {

        int N = A.length;
        if(N<=2){
            return A[0];
        }

        int element1 =  A[0];
        int element2 = A[1];
        int count1 = 1;
        int count2 = 1;

        for (int i = 2; i < N; i++) {

            if(A[i] == element1){
                count1++;
            } else if (A[i] == element2) {
                count2++;
            } else if (count1 == 0) {
                element1 = A[i];
                count1++;
            } else if (count2 == 0) {
                element2 = A[i];
                count2++;
            } else {
                count1--;
                count2--;
            }

        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < N; i++) {
            if(A[i] == element1){
                count1++;
            }
            else if(A[i] == element2){
                count2++;
            }
        }
        if(count1 > N/3){
            return element1;
        }
        else if(count2 > N/3){
            return element2;
        }
        return -1;

    }

    public static void main(String[] args) {
//        int[] A = {4,1,3,2,4,4,3,3,7,3,4};
        int[] A = {1,1,1,2,3,5,7};

        MajorityElement3N maj = new MajorityElement3N();
        System.out.println(maj.majorityElements3N(A));
        System.out.println(maj.repeatedNumber(A));

    }
}
