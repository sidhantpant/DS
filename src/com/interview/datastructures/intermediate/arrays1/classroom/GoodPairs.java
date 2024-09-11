package com.interview.datastructures.intermediate.arrays1.classroom;

public class GoodPairs {

    public int goodPairBruteForce(int[] A,int B){

        int N = A.length;

        for(int i = 0 ; i < N ; i++){
            for(int j= 0 ; j < N ; j++){
                if( i !=j &&  A[i]+A[j] == B){
                    return 1;
                }
            }
        }
        return 0;
    }
    public int goodPairOptimisedApproach(int[] A,int B){

        int N = A.length;

        for(int i = 0 ; i < N ; i++){
            for(int j= 0 ; j < N ; j++){
                if( A[i]+A[j] == B){
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        GoodPairs gp = new GoodPairs();
//        System.out.println(gp.goodPairBruteForce(A,9));
        System.out.println(gp.goodPairOptimisedApproach(A, 7));
    }


}
