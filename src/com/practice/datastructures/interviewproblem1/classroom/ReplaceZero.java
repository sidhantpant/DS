package com.practice.datastructures.interviewproblem1.classroom;

public class ReplaceZero {

    private static int countMaxConsecutive(int[] A) {
        // 1 1 0 1 1 0 1 1 1
        int N = A.length;
        int maxCount = 0;
        for (int i = 0; i < N; i++) {
            int countOnes = 0;
            int countZero = 0;
            for (int j = i; j < N; j++) {
                if (A[j] == 0) {
                    if (countZero == 0) {
                        countZero++;
                    } else if (countZero > 0) {
                        maxCount = Math.max(maxCount, countOnes);
                        break;
                    }
                }
                countOnes++;
            }
        }
        System.out.println(maxCount);
        return maxCount;
    }

    private static int countMaxConsecutiveOptimized(int[] A) {
        // 1 1 0 1 1 0 1 1 1
        int N = A.length;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int countLeft = 0;
            int countRight = 0;
            if (A[i] == 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (A[j] == 0) {
                        break;
                    }
                    countLeft++;
                }
                for (int j = i + 1; j < N; j++) {
                    if (A[j] == 0) {
                        break;
                    }
                    countRight++;
                }
                ans = Math.max(ans, countLeft + countRight + 1);
            }
        }
        System.out.println(ans);
        return ans;
    }

//    private static int maxConsecutivePrefixSum(int[] A){
//        int N = A.length;
//        int[] PS = new int[N+1];
//        PS[0] = 0;
//        for (int i = 1; i < N+1; i++) {
//            PS[i] = PS[i-1] + A[i-1];
//        }
//
//        for (int i = 0; i <N; i++) {
//
//        }
//
//        for (int i = 0; i < N; i++) {
//            if(A[i] == 0){
//                int leftSum = PS[i+1] - PS[0];
//                int rightSum = PS[i]
//            }
//        }
//
//    }


    public static void main(String[] args) {

        int[] A = {1, 1, 0, 1, 1, 0, 1, 1, 1};
        int[] A1 = {0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0};
        countMaxConsecutive(A1);
        countMaxConsecutiveOptimized(A1);
    }

}
