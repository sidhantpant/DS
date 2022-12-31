package com.practice.datastructures.trees.classroom;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }


    private static TreeNode addElementToTree(TreeNode A, int val) {
        if (A == null) {
            A = new TreeNode(val);
            return A;
        }
        if (val < A.val) {
           A.left = addElementToTree(A.left, val);
        } else if (val > A.val) {
            A.right = addElementToTree(A.right, val);
        }
        return A;
    }

    private static int[] inorderTraversal(TreeNode A) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> inorderList = inorderTraversal1(A, list1);
        int N = inorderList.size();
        int[] inorderArray = new int[inorderList.size()];
        for (int i = 0; i < N; i++) {
            inorderArray[i] = inorderList.get(i);
        }
        return inorderArray;
    }

    private static List<Integer> inorderTraversal1(TreeNode A, List<Integer> list) {
        if (A == null) {
            return list;
        }
        inorderTraversal1(A.left, list);
        list.add(A.val);
        inorderTraversal1(A.right, list);
        return list;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        addElementToTree(treeNode, 5);
        addElementToTree(treeNode, 20);
        addElementToTree(treeNode, 3);
        addElementToTree(treeNode, 7);
        addElementToTree(treeNode, 19);
        addElementToTree(treeNode, 21);

        inorderTraversal(treeNode);
    }


}
