package com.practice.datastructures.intro.day1.homework;

public class Solution7 {

    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
//        System.out.println(solution7.countPrime(1000));
        System.out.println(solution7.countPrime1(19));
    }

    public int countPrime(int A) {

        int count = 0;
        for (int j = 1; j <= A; j++) {
            int prime = checkPrime(j);

            if (prime == 1) {
                count++;
            }
        }
        return count;

    }

    public int countPrime1(int A) {
        int totalPrime = 0;
        for (int j = 1; j <= A; j++) {
            int count = 1;
            if (j == 1) {
                count = 0;
            }
            for (int i = 2; i * i <= j; i++) {
                if (j % i == 0) {
                    count = 0;
                    break;
                }
            }
            totalPrime = totalPrime + count;
        }
        return totalPrime;
    }

    public int checkPrime(int j) {
        if (j == 1) {
            return 0;
        }
        for (int i = 2; i * i <= j; i++) {
            if (j % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public int solve(int A) {
        int cnt = 0;
        for (int i = 1; i <= A; i++) {
            int factors = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factors++;
                }
            }
            if (factors == 2) {
                cnt++;
            }
        }
        return cnt;
    }


}