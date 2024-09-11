package com.interview.datastructures.intermediate.trees.assignment;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {

    private List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(10);
        tree1.left = new TreeNode(5);
        tree1.left.left = new TreeNode(2);
        tree1.left.right = new TreeNode(7);
        tree1.left.right.left = new TreeNode(6);
        tree1.left.right.right = new TreeNode(8);

        tree1.right = new TreeNode(20);
        tree1.right.right = new TreeNode(22);
        tree1.right.right.right = new TreeNode(50);
        tree1.right.right.left = new TreeNode(21);

        PreorderTraversal pot = new PreorderTraversal();
        pot.preorder(tree1);
        System.out.println(pot.list);
    }

    public int[] preorder(TreeNode A) {
        preorder1(A);
        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public void preorder1(TreeNode root) {// Root Left Right
        if (root == null) {
            return;
        }
        list.add(root.val);
        preorder1(root.left);
        preorder1(root.right);
    }
}
