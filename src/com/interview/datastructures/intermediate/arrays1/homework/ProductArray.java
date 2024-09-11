package com.interview.datastructures.intermediate.arrays1.homework;

public class ProductArray {

    public void productArrayBruteForce(int[] A) { // 3 2 6 1 4 // 144

        int N = A.length;
        int prodLeft = 1;
        int prodRight = 1;
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < i; j++) {
                prodLeft = prodLeft * A[j];
            }

            for (int k = i + 1; k < N; k++) {
                prodRight = prodRight * A[k];
            }

            P[i] = prodLeft * prodRight;
            prodLeft = 1;
            prodRight = 1;
        }
        System.out.println(P);
    }

    public void productArrayOptimised(int[] A) {
        // 3  2  6  1  4
        // 1  3  6  36 36 144
        // 144 48 24 4  4  1

        // 48 72 24 144 36

        int N = A.length;
        int[] PPR = new int[N + 1];
        PPR[0] = 1;
        //crete the product prefix
        for (int i = 1; i < N + 1; i++) {
            PPR[i] = PPR[i - 1] * A[i - 1];
        }


        int[] SPR = new int[N + 1];
        SPR[N] = 1;
        //create the product suffix
        for (int i = N - 1; i >= 0; i--) {
            SPR[i] = SPR[i + 1] * A[i];
        }

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            ans[i] = PPR[i] * SPR[i + 1];
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] A = {3, 2, 6, 1, 4};
        ProductArray prod = new ProductArray();
        prod.productArrayOptimised(A);
    }


}
