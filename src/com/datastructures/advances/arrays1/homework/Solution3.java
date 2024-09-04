package com.datastructures.advances.arrays1.homework;

public class Solution3 {

    private static int[] flipKadanes(String A) {
        int N = A.length();
        int[] M = new int[N];
        int[] pair = new int[2];
        for (int i = 0; i < N; i++) {
            if (A.charAt(i) == '0') {
                M[i] = 1;
            } else {
                M[i] = 0;
            }
        }
        int curr_sum = 0;
        int max_sum = 0;
        int first_index = 0;
        int last_index = 0;
        int idx = 0;
        for (int i = 0; i < N; i++) {
            curr_sum = curr_sum + M[i];
            if (curr_sum < 0) {
                curr_sum = 0;
                idx = i + 1;
                continue;
            } else if (curr_sum > max_sum) {
                first_index = idx;
                last_index = i;
                max_sum = curr_sum;
            }

        }
        pair[0] = first_index;
        pair[1] = last_index;
        return pair;
    }

    static int[] flipKadanesWorking(String S){
        int N = S.length();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            if(S.charAt(i) == '1'){
                A[i] = -1;
            }else if( S.charAt(i) == '0'){
                A[i] = 1;
            }
        }
        int curr_sum = 0;
        int max_sum = 0;
        int l = 0 ;
        int r = -1;
        int idx = 0;
        for (int i = 0; i < N; i++) {
            curr_sum = curr_sum + A[i];
            if(curr_sum < 0 ){
                curr_sum = 0 ;
                idx = idx+1;
            }else if(curr_sum > max_sum){
                l = idx;
                r = i;
                max_sum = curr_sum;
            }
        }
        if( r != -1){
            return new int[]{l+1,r+1};
        }else{
            return new int[]{};
        }
    }

    public static void main(String[] args) {
        System.out.println(flipKadanesWorking("1000010001"));
        //1000010001
        //0111100001
        //1111101111
    }

}
