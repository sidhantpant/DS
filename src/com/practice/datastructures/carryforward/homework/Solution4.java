package com.practice.datastructures.carryforward.homework;

public class Solution4 {

    private static String evenSubArrays(int[] A) {

        int N = A.length;
        int size = N % 2;
        if (size == 0) {
            int first = A[0];
            int second = A[N - 1];
            int fourth = A[size];
            return !((first % 2 == 0) && (second % 2 == 0) && (fourth % 2 == 0)) ? "NO" : "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        int[] A ={654, 50, 694, 750, 712, 275, 736, 146, 279, 816, 707, 396, 406, 589, 370, 742, 840, 290, 505, 23, 249, 447, 618, 80, 968, 189, 600, 662, 91, 604, 575, 689, 72, 196, 475, 198, 850, 844, 361, 419, 617, 911, 268, 628, 408, 404, 477, 921, 478, 806, 204, 637, 403, 911, 589, 529, 867, 584, 768, 257, 437, 380, 698, 452, 368, 97, 977, 582, 775, 103};
        int[] A1 ={121, 351, 314, 562, 953, 319, 859, 413, 201, 640, 66, 723, 998, 612, 291, 539, 463, 340, 64, 251, 807, 457, 584, 944, 315, 327, 769, 675, 113, 364, 488, 579, 674, 340, 950, 516, 618, 599, 186, 496, 403, 450, 833, 79, 229, 150, 497, 256, 971, 687, 318, 717, 540, 126, 906, 843, 417, 557, 97, 370, 409, 148, 968, 562, 534, 845, 378 };
        System.out.println(evenSubArrays(A));
    }
}
