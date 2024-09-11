package com.interview.datastructures.intermediate.sorting.assignment;

public class SortByColor {

    public int[] sortArrayColors(int[] A) {
        int zero = 0;
        int two = A.length - 1;
        int i = 0;

        while (i <= two) {
            if (A[i] == 0) {
                int temp = A[zero];
                A[zero] = 0;
                A[i] = temp;
                zero++;
                i++;
            } else if (A[i] == 2) {
                int temp = A[two];
                A[two] = 2;
                A[i] = temp;
                two--;
            } else {
                i++;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 2, 0, 1, 1};
        SortByColor sb = new SortByColor();
        sb.sortArrayColors(A);
    }

}
