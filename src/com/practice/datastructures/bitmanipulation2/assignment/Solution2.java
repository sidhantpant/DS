package com.practice.datastructures.bitmanipulation2.assignment;

public class Solution2 {

    public int setBits(int A){
        int count = 0;
        for(int i =0 ;i < 32 ;i++){
           int bit = checkBit(A,i);
           if(bit == 1){
               count = count+1;
           }
        }
        return count;
    }

    public int checkBit(int A,int pos){

        return A & (1 << pos);
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        sol.checkBit(4,2);
    }
}
