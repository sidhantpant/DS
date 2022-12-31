package com.datastructures.advances.arrays3.classroom.assignment;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Definition for an interval.
 * public class Interval {
 * int start;
 * int end;
 * Interval() { start = 0; end = 0; }
 * Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        ArrayList<Interval> mergeIntervals = new ArrayList<>();
        Collections.sort(intervals,(I1, I2)->I1.start-I2.start);
        int SCurr = intervals.get(0).start;
        int ECurr = intervals.get(0).end;
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start <= ECurr) {
                ECurr = Math.max(ECurr, intervals.get(i).end);
            } else {
                mergeIntervals.add(new Interval(SCurr, ECurr));
                SCurr = intervals.get(i).start;
                ECurr = intervals.get(i).end;
            }
        }
        mergeIntervals.add(new Interval(SCurr, ECurr));
        return mergeIntervals;
    }

    public static void main(String[] args) {
        Interval i1 = new Interval(4, 4);
        Interval i2 = new Interval(56, 60);
        Interval i5 = new Interval(61, 86);
        Interval i3 = new Interval(9, 42);
        Interval i4 = new Interval(84, 90);
        Interval i6 = new Interval(5, 89);
        ArrayList<Interval> l1 = new ArrayList<>();
        l1.add(i1);
        l1.add(i2);
        l1.add(i5);
        l1.add(i3);
        l1.add(i4);
        l1.add(i6);
        System.out.println(merge(l1));
    }
}
