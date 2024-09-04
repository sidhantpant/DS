package com.datastructures.advances.binarysearch1.homework;

public class Solution1 {

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        Solution1 sol = new Solution1();
        System.out.println(sol.searchMatrix(A, 2));
    }

    public int searchMatrix(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;
        int l = 0 ;
        int h = n*m-1;

        while (l <= h){
            int mid = (l+h)/2;
            int r = mid/m;
            int c = mid%m;
            System.out.println(r+"-"+c);
            if(A[r][c] == B){
                return 1;
            }
            if(A[r][c] < B){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return 0;
    }
}
