package com.datastructures.advances.queues1.assignment;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

    public static String solve(int A){
        Queue<String> queue = new LinkedList<>();
        queue.add("11");
        queue.add("22");

        for (int i = 1; i < A; i++) {
            String s = queue.peek();
            int l = s.length();
            String firstHalf = s.substring(0,l/2);
            String secondHalf = s.substring(l/2,l);
            queue.remove();
            queue.add(firstHalf+"11"+secondHalf);
            queue.add(firstHalf+"22"+secondHalf);
        }
        String s = queue.peek();
        return s;
    }
}
