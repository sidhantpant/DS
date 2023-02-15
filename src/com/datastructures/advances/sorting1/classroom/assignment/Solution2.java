package com.datastructures.advances.sorting1.classroom.assignment;

public class Solution2 {

    public static void main(String[] args) {
        int[] A = {14046, 57239, 78362, 99387, 27609, 55100, 65536, 62099, 40820,
                33056, 88380, 78549, 57512, 33137, 81212, 32365, 42276, 65368, 52459,
                74924, 25355, 76044, 78056, 45190, 94365, 58869, 20611};
        int[] A1 = {8, 6, 7, 1, 3};
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solve(A1));
    }

    public int solve(int[] A) {

        int N = A.length;
        int s = 0;
        int e = N - 1;
        int count = mergeSort(A, s, e);
        return count;
    }

    public int mergeSort(int[] A, int s, int e) {
        if (s == e) {
            return 0;
        }
        int m = (s + e) / 2;
        int a = mergeSort(A, s, m);
        int b = mergeSort(A, m + 1, e);
        int awithb = merge(A, s, m, e);
        return a + b + awithb;
    }

    public int merge(int[] A, int s, int m, int e) {
        int p1 = s;
        int p2 = m + 1;
        int p3 = 0;
        int count = 0;
        int[] tmp = new int[e - s + 1];
        while (p1 <= m && p2 <= e) {

            if (A[p1] > 2L * A[p2]) {
                count = count + (m - p1 + 1);
                p2++;
            } else {
                p1++;
            }

        }
        p1 = s;
        p2 = m + 1;
        while (p1 <= m && p2 <= e) { // 6 7 8.  1 3

            if (A[p1] <= A[p2]) {
                tmp[p3] = A[p1];
                p1++;
                p3++;
            }
            // else if (A[p1] > 2 * A[p2]) {
            //     tmp[p3] = A[p2];
            //     p3++;
            //     p2++;
            //     count = count + (m - p1 + 1);
            // }
            else {
                tmp[p3] = A[p2];
                p2++;
                p3++;
            }
        }
        while (p1 <= m) {
            tmp[p3] = A[p1];
            p1++;
            p3++;
        }
        while (p2 <= e) {
            tmp[p3] = A[p2];
            p2++;
            p3++;
        }
        int i = s;
        int j = 0;
        while (i <= e) {
            A[i] = tmp[j];
            i++;
            j++;
        }
        return count;
    }

}

