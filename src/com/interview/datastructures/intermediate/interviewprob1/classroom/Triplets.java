package com.interview.datastructures.intermediate.interviewprob1.classroom;

public class Triplets {

    public int triplets(int[] A){

        int N = A.length;
        int totalCount = 0;
        for(int i = 0 ; i < N; i++){
            int countLeft = 0 ;
            int countRight = 0 ;
            for(int j = i- 1; j >= 0 ; j--){
                if(A[j] < A[i]){
                    countLeft++;
                }
            }

            for (int j = i+1 ; j < N; j++) {
                if(A[j] > A[i]){
                    countRight++;
                }
            }

            totalCount = totalCount+(countLeft*countRight);
        }
        return totalCount;
    }

    public static void main(String[] args) {
        int[] A = {1,2,4,3};
        Triplets trp = new Triplets();
        System.out.println(trp.triplets(A));
    }
}
