package com.interview.datastructures.slidingwindow.classroom;

public class SubArrraySum {

    //slightly tricky. Iterate from 0 to N-K since outside this will go ArrayIndexOOBE .In the nested loop iterate frpm
    //
    public void subArraySumBruteForce(int[] A,int K){

        int N = A.length;
        for(int i = 0 ; i <= N-K ; i++){
            int sum = 0 ;
            for(int j = i ; j <= K+i-1 ; j++){
                sum = sum + A[j];
            }
            System.out.println(sum);
        }

    }

    public void subArraySumBruteForceWhileLoop(int[] A,int K){
        int N = A.length;
        int s = 0 ;
        int e = K-1 ;

        while(e < N){
            int sum = 0 ;
            for(int i = s ; i <= e ; i++){
                sum = sum+A[i];
            }
            s++;
            e++;
            System.out.println(sum);
        }
    }

    public void subArraySumSlidingWindow(int[] A,int K){

        int N = A.length;
        int sum = 0;
        for(int i =0 ; i < K ; i++){
            sum = sum + A[i];
        }
        System.out.println(sum);

        int s = 1;
        int e = K ;
        while(e < N){
            sum = sum - A[s-1]+A[e];
            System.out.println(sum);
            s++;
            e++;
        }
    }

    public static void main(String[] args) {
        int[] A = {-3,4,-2,5,3,-2,8,2,-1,4};
        SubArrraySum sum = new SubArrraySum();
      //  sum.subArraySumBruteForce(A, 5);
      //  System.out.println("==");
      //  sum.subArraySumBruteForceWhileLoop(A,5);
        System.out.println("==");
        sum.subArraySumSlidingWindow(A,5);
    }

}
