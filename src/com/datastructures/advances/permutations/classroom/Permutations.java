package com.datastructures.advances.permutations.classroom;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.print;

public class Permutations {

    List<char[]> l1 = new ArrayList<>();
    void permute(char[] A, boolean[] vist,char[] ans,int idx){
        int N = ans.length;
        if(idx == N){
            print(ans);
            l1.add(ans);
            return;
        }
        for (int i = 0; i < N ; i++) {
            if(!vist[i]){
                vist[i] = true;
                ans[idx] = A[i];
                permute(A,vist, ans,idx+1);
                vist[i] = false;
            }
        }
    }

    void print(char[] ans){
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        String s = "abc";
        Permutations permutations = new Permutations();
        boolean[] vist = new boolean[3];
        char[] ans = new char[3];
        permutations.permute(s.toCharArray(),vist,ans,0);
        System.out.println(permutations.l1);
    }



}
