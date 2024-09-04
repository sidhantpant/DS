package com.datastructures.advances.hashing2.classroom;

import java.util.HashSet;

public class Triangle {

    public int rightTriangle(int[] X, int[] Y) { // TC; O(N3)
        int N = X.length;
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (((X[i] == X[k] && Y[i] == Y[j]) || (X[i] == X[j] && Y[i] == Y[k]))
                            || ((X[j] == X[k] && Y[j] == Y[i]) || ((X[i] == X[j] && Y[j] == Y[k])))
                            || ((X[j] == X[k] && Y[k] == Y[i]) || (X[i] == X[k] && Y[k] == Y[j]))) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int rightTriangleN2(int[] X, int[] Y) {
        int N = X.length;
        HashSet<String> hashSet = new HashSet<>();
        // add every element to hash set ,either make a pair or a String with seperator
        for (int i = 0; i < N; i++) {
            hashSet.add(X[i] + "_" + Y[i]);
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                int x1 = X[i];
                int y1 = Y[i];
                int x2 = X[j];
                int y2 = Y[j];
                if (!(x1 == x2 || y1 == y2)) {
                    String P1 = x1 + "_" + y2;
                    String P2 = x2 + "_" + y1;
                    if (hashSet.contains(P1)) {
                        count = count + 1;
                    }
                    if (hashSet.contains(P2)) {
                        count = count + 1;
                    }
                }

            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] X = {1, 3, 5, 5, 1};
        int[] Y = {3, 3, 3, 1, 1};

        Triangle triangle = new Triangle();
        System.out.println(triangle.rightTriangle(X, Y));

        System.out.println(triangle.rightTriangleN2(X, Y));
    }

}
