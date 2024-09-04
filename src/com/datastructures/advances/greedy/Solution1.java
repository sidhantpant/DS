package com.datastructures.advances.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1 {
    public int solve(int[] A, int[] B) {
        int N = A.length;
        List<Pair> pairList = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            Pair p = new Pair(A[i],B[i]);
            pairList.add(p);
        }

        Collections.sort(pairList, (p1, p2)-> Integer.valueOf(p1.getEnd()).compareTo(p2.getEnd()));
        int ans = 0 ;
        Pair p = pairList.get(0);
        int lastEndTime = p.getEnd();
        for(int i = 1 ; i < N ; i++){
            Pair p2 = pairList.get(i);
            int start2 = p2.getStart();
            int end2 = p2.getEnd();

            if(start2 >= lastEndTime){
                ans++;
                lastEndTime = end2;
            }

        }
        return ans;
    }
}

class Pair{

    public int start;
    public int end;

    Pair(int start, int end){
        this.start = start;
        this.end = end;
    }

    public int getStart(){
        return start;
    }

    public int getEnd(){
        return end;
    }

}
