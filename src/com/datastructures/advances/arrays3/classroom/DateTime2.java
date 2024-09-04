package com.datastructures.advances.arrays3.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DateTime2 {

    private static void overlappingTime(int[] S, int[] E, int SNew, int ENew) {

        int N = S.length;
        for (int i = 0; i < N; i++) {
            if (SNew <= E[i] && ENew >= S[i]) { //2<=9
                S[i] = Math.min(SNew, S[i]);
                E[i] = Math.max(ENew, E[i]);
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(S[i]+"="+E[i]);
        }
    }

    private static List<Interval> mergeInterval(List<Interval> S, Interval newInterval){
        int N= S.size();
        List<Interval> result = new ArrayList<>();
        int Scurr = newInterval.start;//1
        int Ecurr = newInterval.end;//6
        for(int i = 0 ; i < N;i++ ){
            int Si = S.get(i).start; //6
            int Ei = S.get(i).end; // 9
            if(Scurr <= Ei && Ecurr >= Si){
                newInterval.start = Math.min(Scurr,Si);
                newInterval.end = Math.max(Ecurr,Ei);
                System.out.println(newInterval.start + "" + newInterval.end);
            }else{
                result.add(S.get(i));
            }
        }
        result.add(newInterval);
        return result;
    }

    public static void main(String[] args) {
        int[] S = {1,6};
        int[] E = {3,9};
        overlappingTime(S, E, 2, 5);
        List<Interval> intervals = Arrays.asList(new Interval(1,3),new Interval(6,9));
        Interval interval = new Interval(2,5);
        System.out.println(mergeInterval(intervals,interval));
    }
}

class Interval{
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }

}
