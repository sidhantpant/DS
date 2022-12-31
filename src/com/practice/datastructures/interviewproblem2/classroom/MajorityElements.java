package com.practice.datastructures.interviewproblem2.classroom;

public class MajorityElements {


    private static void getMajorityElement(int[] A){

        int N = A.length;
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = i; j < N; j++) {
                if(A[i] == A[j]){
                    count++;
                    if( count > maxCount ){
                        maxCount = count;
                        index = i;
                    }
                }
            }
        }
        if(maxCount > N/2){
            System.out.println(index);
            System.out.println(A[index]);
        }
    }

    public static void main(String[] args) {

        int[] A = {3,2,1,1,1,4,3,1,1,1};
        getMajorityElement(A);

    }

}
