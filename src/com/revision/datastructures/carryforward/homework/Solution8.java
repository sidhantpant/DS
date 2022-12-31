package com.revision.datastructures.carryforward.homework;

/*You have to pick B elements in total. Some (possibly 0) elements from left end of array A and some (possibly 0) from the right end of array A to get the maximum sum.
Find and return this maximum possible sum.*/
public class Solution8 {

    public static int pickFromBothSides(int[] A, int B) {
        int N = A.length;
        int[] PS = new int[N + 1];
        int[] SS = new int[N + 1];
        int sum = Integer.MIN_VALUE;

        // create a PS
        PS[0] = 0;
        for (int i = 1; i < N + 1; i++) {
            PS[i] = PS[i - 1] + A[i - 1];
        }
        // create a SS
        SS[0] = 0;
        for (int i = 1; i < N + 1; i++) {
            SS[i] = SS[i - 1] + A[N - i];
        }

        for (int i = 0; i <= B; i++) {
            sum = Math.max(sum, PS[B - i] + SS[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = {3,2,1,2,2,4,1};
        int[] A1 = {-969, -948, 350, 150, -59, 724, 966, 430, 107, -809, -993, 337, 457, -713, 753, -617, -55, -91, -791, 758, -779, -412, -578, -54, 506, 30, -587, 168, -100, -409, -238, 655, 410, -641, 624, -463, 548, -517, 595, -959, 602, -650, -709, -164, 374, 20, -404, -979, 348, 199, 668, -516, -719, -266, -947, 999, -582, 938, -100, 788, -873, -533, 728, -107, -352, -517, 807, -579, -690, -383, -187, 514, -691, 616, -65, 451, -400, 249, -481, 556, -202, -697, -776, 8, 844, -391, -11, -298, 195, -515, 93, -657, -477, 587};
        System.out.println(pickFromBothSides(A1,81));
    }
    
}
