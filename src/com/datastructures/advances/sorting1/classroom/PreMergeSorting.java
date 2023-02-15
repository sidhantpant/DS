package com.datastructures.advances.sorting1.classroom;

public class PreMergeSorting {

    static int[] merge(int[] A ,int[] B){
        int N = A.length;int M = B.length;
        int p1=0;
        int p2=0;
        int[] C = new int[M+N];

        int p3 = 0;
        while( (p1<N) && (p2<M)){

            if(A[p1] <= B[p2]){
                C[p3] = A[p1];
                p1= p1+1;
                p3 = p3+1;
            }else{
                C[p3] = B[p2];
                p2 = p2+1;
                p3 = p3+1;
            }
        }
        // copy remaining elements
        while(p1<N){
            C[p3] = A[p1];
            p1 = p1+1;
            p3 = p3+1;
        }
        while(p2<M){
            C[p3] = B[p2];
            p2 = p2+1;
            p3 = p3+1;
        }
        return C;
    }

    public static void main(String[] args) {
        int[] A = {7,10,11,14};
        int[] B = {3,8,9};
        merge(A,B);
    }
}
