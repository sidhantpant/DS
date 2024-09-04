package com.datastructures.advances.treetraversal4.assignment;

import com.datastructures.advances.trees5.classroom.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1 {

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public int lca(TreeNode A, int B, int C) {
        int[] X = new int[3];
        Collections.sort(list1,(o1, o2) -> o1.compareTo(o2));
        search(A, B, list1);
        Collections.reverse(list1);
        search(A, C, list2);
        Collections.reverse(list2);
        int N1 = list1.size() - 1; // 2 4 5 6 9
        int N2 = list2.size() - 1; // 1 3 5 6 9
        while (N1 >= 0 && N2 >= 0) {
            System.out.println("list1" + list1.get(N1));
            System.out.println("list2" + list2.get(N2));
            if (list1.get(N1) == list2.get(N2)) {
                N1--;
                N2--;
            } else {
                break;
            }
        }
        return list1.get(N1 + 1);
    }

    public boolean search(TreeNode A, int B, List<Integer> list) {
        if (A == null) {
            return false;
        }
        if (A.data == B) {
            list.add(A.data);
            return true;
        }

        if (search(A.left, B, list) || search(A.right, B, list)) {
            list.add(A.data);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        TreeNode treeNode1= new TreeNode(1);
        treeNode1.left = new TreeNode(-1);
        treeNode1.left.left = new TreeNode(-1);

        sol.lca(treeNode1,1,1);
    }

}
