package com.interview.datastructures.intermediate.subarrays.assignment;

public class ClosestMixMax {

    public int closesMinMaxBruteForce(int[] A){

        int N = A.length;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0 ; i < N  ;i++){
            minValue = Math.min(minValue,A[i]);
            maxValue = Math.max(maxValue,A[i]);
        }
        int ans = N;
        for(int i = 0 ; i < N ; i++){
            for (int j = i+1; j < N; j++) {

                if(A[i] == minValue && A[j] == maxValue){
                    ans = Math.min(ans, j-i+1);
                }

                if(A[i] == maxValue && A[j] == minValue){
                    ans = Math.min(ans,j-i+1);
                }
            }
        }
        return ans;
    }

    public int closesMinMax(int[] A){
        int N = A.length;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int lastMinIndex = -1;
        int lastMaxIndex = -1;

        for (int i = 0; i < N; i++) {
            minValue = Integer.min(A[i],minValue);
            maxValue = Integer.max(A[i],maxValue);
        }
        int ans = N;
        for (int i = 0; i < N; i++) {

            if(A[i] == minValue){
                lastMinIndex = i;
                if(lastMaxIndex > 0){
                    ans = Math.min(ans, i-lastMaxIndex+1);
                }
            }

            if(A[i] == maxValue){
                lastMaxIndex = i;
                if(lastMinIndex > 0){
                    ans = Math.min(ans, i-lastMinIndex+1);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {2, 6, 1, 6, 9};
        ClosestMixMax cl = new ClosestMixMax();
//        cl.closesMinMaxBruteForce(A);
        cl.closesMinMax(A);
    }


}
