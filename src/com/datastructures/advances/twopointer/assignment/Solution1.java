package com.datastructures.advances.twopointer.assignment;

import com.revision.datastructures.contest1.Solution;

public class Solution1 {
    public int[] solve(int[] A, int B) {

        int N = A.length;
        int L = 0;
        int R = 0;
        int sum = A[L] ;
        boolean flag = false;
        while( R < N){

            if(sum == B){
                flag = true;
                break;
            }
            else if(sum < B){
                R++;
                if(R == N){
                    break;
                }
                sum = sum + A[R];
            }
            else{
                sum = sum - A[L];
                L++;
            }

        }
        int[] ans = new int[R-L+1];
        int index = 0 ;
        if(flag == true ){
            for(int i = L ;i <= R; i++){
                ans[index] = A[i];
                index++;
            }
            return ans;
        }
        return new int[]{-1};

    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        Solution1 sol = new Solution1();
        sol.solve(A,5);
    }
}

