package com.datastructures.advances.primenumbers.classroom;

public class PrimeNumbers {

    private static boolean isPrime(int N) {
        int count = 0;
        if (N == 0 || N == 1) {
            return false;
        }
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;

    }

    private static int countNumberOfPrimes(int N) {
        int count = 0;
        for (int i = 2; i < N; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static int optimisedCountPrime(int N) {

        boolean[] B = new boolean[N + 1];
        B[0] = false;
        B[1] = false;
        for (int i = 2; i < N + 1; i++) {
            B[i] = true;
        }

        for (int i = 2; i < N + 1; i++) {
            if (B[i]) {
                for (int j = 2 * i; j < N+1; j = j + i) {
                    B[j] = false;
                }
            }
        }
        int count = 0 ;
        for (int i = 0; i < N+1; i++) {
            if(B[i]){
                count ++;
            }
        }
        return count;
    }

    private static int moreOptimisedCountPrime(int N) {

        boolean[] B = new boolean[N + 1];
        B[0] = false;
        B[1] = false;
        for (int i = 2; i*i <= N ; i++) {
            B[i] = true;
        }

        for (int i = 2; i < N + 1; i++) {
            if (B[i]) {
                for (int j = i * i; j < N+1; j = j + i) {
                    B[j] = false;
                }
            }
        }
        int count = 0 ;
        for (int i = 0; i < N+1; i++) {
            if(B[i]){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(countNumberOfPrimes(50)); // O(N *Sqrt(N))
        System.out.println(optimisedCountPrime(50)); // O(N *Sqrt(N))
        // 1 2 4 5 10 20 25 50 100
    }


}
