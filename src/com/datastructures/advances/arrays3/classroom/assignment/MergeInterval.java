package com.datastructures.advances.arrays3.classroom.assignment;

import java.util.ArrayList;

public class MergeInterval {

    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        if (newInterval.start > newInterval.end) {
            int temp = newInterval.start;
            newInterval.start = newInterval.end;
            newInterval.end = temp;
        }
        int N = intervals.size();
        ArrayList<Interval> mergedIntervals = new ArrayList<>();

        for (Interval interval : intervals) {
            int start = interval.start;
            int end = interval.end;
            int startNew = newInterval.start;
            int endNew = newInterval.end;
            if (startNew <= end && endNew >= start) {
                start = Math.min(start, startNew);
                end = Math.max(end, endNew);
                interval.start = start;
                interval.end = end;
                mergedIntervals.add(interval);
            }
            if(Math.max(start,startNew) > Math.min(end,endNew)){
                break;
            }
        }
        return mergedIntervals;
    }

    private static void overlapping(ArrayList<Interval> intervals, Interval newInterval){

        boolean unused =true;

        for(Interval interval : intervals){
            int start = interval.start;
            int end = interval.end;
            int startNew = newInterval.start;
            int endNew = newInterval.end;

            if(start > endNew){
                unused = false;

            }
            if (startNew <= end && endNew >= start) {
                start = Math.min(start, startNew);
                end = Math.max(end, endNew);
                interval.start = start;
                interval.end = end;
//                mergedIntervals.add(interval);
            }


        }

    }


    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>();
        Interval i1 = new Interval(3, 5);
        Interval i2 = new Interval(6, 9);
        intervals.add(i1);
        intervals.add(i2);

        Interval merge = new Interval(1, 2);
        System.out.println(insert(intervals, merge));
    }

}

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }

    @Override
    public String toString() {
        return "Interval{" + "start=" + start + ", end=" + end + '}';
    }


}
