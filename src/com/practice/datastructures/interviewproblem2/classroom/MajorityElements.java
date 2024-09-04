package com.practice.datastructures.interviewproblem2.classroom;

public class MajorityElements {


    private static void getMajorityElement(int[] A) {

        int N = A.length;
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = i; j < N; j++) {
                if (A[i] == A[j]) {
                    count++;
                    if (count > maxCount) {
                        maxCount = count;
                        index = i;
                    }
                }
            }
        }
        if (maxCount > N / 2) {
            System.out.println(index);
            System.out.println(A[index]);
        }
    }

    int majorityElements(int[] A) {
        int N = A.length;
        int ME = A[0];
        int count = 1;

        for (int i = 1; i < N; i++) {

            if (A[i] != ME) {
                if (count == 0) {
                    ME = A[i];
                    count++;
                } else {
                    count--;
                }
            } else {
                count++;
            }
        }
        return ME;
    }

    int majorityElements1(int[] A) {
        int N = A.length;
        int ME = A[0];
        int count = 1;

        for (int i = 1; i < N; i++) {
            if (A[i] == ME) {
                count++;
            } else if (count == 0) {
                ME = A[i];
                count++;
            } else {
                count--;
            }
        }
        return ME;
    }

    int majorityElements2(int[] A) {
        int N = A.length;
        int ME = A[0];
        int count = 1;

        for (int i = 2; i < N; i++) {
            if (A[i] == ME) {
                count++;
            } else if (count == 0) {
                ME = A[i];
            } else{
                count--;
            }
        }
        int count1 = 0 ;
        for (int i = 0; i < A.length; i++) {
            if(A[i] == ME){
                count1++;
            }
        }
        if(count1> N/2){
            return ME;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] A = {3, 2, 1, 1, 1, 4, 3, 1, 1, 1};
        getMajorityElement(A);

        int[] B = {4, 6, 5, 3, 4, 5, 6, 4, 4, 4};
        MajorityElements me = new MajorityElements();
        System.out.println(me.majorityElements1(B));
        System.out.println(me.majorityElements2(B));

    }

}
