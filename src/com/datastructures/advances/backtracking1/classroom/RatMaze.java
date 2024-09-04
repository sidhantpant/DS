package com.datastructures.advances.backtracking1.classroom;

import com.sun.scenario.effect.impl.state.AccessHelper;

public class RatMaze {

    int[][] A = new int[5][5];
    int count = 0 ;
    boolean check(int[][] A,int i,int j){
        int M = A.length-1;
        int N = A[M].length-1;
        count++;
        if(i == N-1 && j == M-1 ){
            return true;
        }
        if(i <0 || i >= N || j< 0 || j>=M){
            return false;
        }
        if(A[i][j] == 1 || A[i][j] == 2){
            return false;
        }
        A[i][j] = 2;
        return check(A,i,j+1) || check(A,i,j-1) || check(A,i-1,j);

    }

    public static void main(String[] args) {
        int[][] A = new int[5][5];
        RatMaze ratMaze = new RatMaze();
        System.out.println(ratMaze.check(A,0,0));
        System.out.println(ratMaze.count);
    }
}
