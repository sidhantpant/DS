package com.interview.datastructures.String.assignment;

public class ToLower {

    public String toLower(char[] A) {
        int N = A.length;

        for (int i = 0; i < N; i++) {
            if (A[i] >= 65 && A[i] <= 90) {
                A[i] = (char) (A[i] + 32);
            }
        }
        return new String(A);
    }

    public static void main(String[] args) {
        char[] ch = {'A', 'M', 'i', 'T'};
        ToLower toLower = new ToLower();
        System.out.println(toLower.toLower(ch));
    }


}
