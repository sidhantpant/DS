package com.datastructures.advances.hashing2.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Solution {

    public int[] solve(String A, int[][] B) {

        List<Integer> list = new ArrayList<>();
        char[] ch = A.toCharArray();

        for (int i = 0; i < B.length; i++) {
            int type = B[i][0];
            int index = B[i][1] - 1;
            int N = A.length();
            if (type == 1) {
                ch[index] = ch[index] == '1' ? '0' : '1';
            } else if (type == 2) {
                if (ch[index] == '1') {
                    list.add(index + 1);
                } else {
                    //check left side
                    int left_index = Integer.MAX_VALUE;
                    for (int j = index; j >= 0; j--) {
                        if (ch[j] == '1') {
                            left_index = index - j;
                            break;
                        }
                    }
                    //check right side
                    int right_index = Integer.MAX_VALUE;
                    for (int j = index; j < N; j++) {
                        if (ch[j] == '1') {
                            right_index = j - index;
                            break;
                        }
                    }
                    if (left_index == Integer.MAX_VALUE && right_index == Integer.MAX_VALUE) {
                        list.add(-1);
                    } else {
                        int ans = Math.min(left_index, right_index);
                        if (ans == left_index) {
                            list.add(index - ans + 1);
                        } else {
                            list.add(index + ans + 1);
                        }
                    }
                }
            }
        }

        int[] arr = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            arr[k] = list.get(k);
        }
        return arr;
    }

    public int[] solve1(String A, int[][] B) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '1') {
                treeSet.add(i + 1);
            }
        }
        for (int i = 0; i < B.length; i++) {
            int type = B[i][0];
            int index = B[i][1] - 1;

            // this is to flip the value . If present it is added if 0 it is removed
            if (type == 1) {
                if (treeSet.contains(index)) {
                    treeSet.remove(index);
                } else {
                    treeSet.add(index);
                }
            }
            if (type == 2) {
                if (treeSet.contains(index)) {
                    list.add(index);
                } else {

                    int left_length = Integer.MIN_VALUE;
                    int right_length = Integer.MAX_VALUE;

                    if(treeSet.floor(index)!= null){
                        left_length = treeSet.floor(index);
                    }
                    if(treeSet.ceiling(index)!= null){
                        right_length = treeSet.ceiling(index);
                    }

                    if (left_length == Integer.MIN_VALUE && right_length == Integer.MAX_VALUE) {
                        return new int[]{-1};
                    } else {
                        int ans = Math.min(left_length, right_length);
                        if (ans == left_length) {
                            list.add(index - ans );
                        } else {
                            list.add(index + ans );
                        }
                    }
                }

            }
        }
        int[] arr = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            arr[k] = list.get(k);
        }
        return arr;
    }

    public static void main(String[] args) {
        String A = "100000";
        int[][] B = {{2, 3}, {1, 5}};
//        int[][] B = {{1, 3}, {1, 3}, {2, 4}, {2, 2}, {1, 1}, {2, 3}, {1, 5}, {1, 5}};
        Solution sol = new Solution();
        sol.solve1(A, B);
    }

}
