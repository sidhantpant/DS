package com.datastructures.advances.sorting1.classroom;

public class BubbleSort {

    static void bubbleSort(int[]  A){
        int N = A.length;
        for (int i = 0; i < N; i++) {
            int c=0;
            for (int j = 0; j < N-1; j++) {
                if(A[j] > A[j+1]){
                    swap(A,j,j+1);
                    c = c+1;
                }

            }
            if(c==0){
                break;
            }

        }
        System.out.println(A);
    }

    static void swap(int[] A ,int first ,int second){
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;

    }

    public static int solve(int[] A) {

        int N = A.length;
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N -i-1 ; j++){
                if(A[j] > A[j+1]){
                    swap(A, j , j+1);
                }
            }
        }

        for(int i = 0 ;i < N ; i++){
            System.out.println(A[i]);
        }
        for(int i =0 ; i < N-1 ;i++){
            if(A[i]!= A[i+1]-1){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
//        int[] A = {2,8,5,-1,6,7,4,10,-1};
        int[] A = {2,4,1,3,5,6};
//        bubbleSort(A);
        solve(A);
    }
}
