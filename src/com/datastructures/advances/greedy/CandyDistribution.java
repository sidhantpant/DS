package com.datastructures.advances.greedy;

public class CandyDistribution {

    int candyDistribution(int[] A){

        int N = A.length;
        int[] C = new int[N];
        int[] D = new int[N];
        C[0] = 1;
        int freq = 1;
        for (int i = 1; i < N; i++) {

            if(A[i] > A[i-1]){
                C[i] = C[i-1]+1;
            }else{
                C[i] = 1;
            }

        }
        D[N-1] = Math.max(C[N-1],1);
        for(int i = N-2 ;i >= 0 ;i--){
            if(A[i] > A[i+1] ){
                D[i] = Math.max(C[i],D[i+1]+1);
            }else{
                D[i] = Math.max(C[i],1);
            }
        }
        int ans = 0 ;
        for (int i = 0; i < N; i++) {
           ans = ans + D[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 6,3,1,10,12,20,5,2};// 1 2 1 1//
        CandyDistribution cd = new CandyDistribution();
        System.out.println(cd.candyDistribution(A));
    }
}
