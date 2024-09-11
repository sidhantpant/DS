package com.interview.datastructures.intermediate.trees.homework;


public class IdenticalBTrees {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(2);
        treeNode1.left = new TreeNode(3);
        treeNode1.right = new TreeNode(5);

        TreeNode treeNode2 = new TreeNode(2);
        treeNode2.left = new TreeNode(3);
        treeNode2.right = new TreeNode(6);

        IdenticalBTrees id = new IdenticalBTrees();
        System.out.println(id.isIdentical(treeNode1, treeNode2));
    }

    public boolean isIdentical(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return true;
        }

        boolean left = isIdentical(A.left, B.left);
        boolean right = isIdentical(A.right, B.right);
        if ((A.val == B.val) && (left == right)){
            return true;
        }
        return false;
    }

    public int isSameTree(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return 0;
        }

        int left = isSameTree(A.left, B.left);
        int right = isSameTree(A.right, B.right);
        if ((A.val == B.val)){
            return 1;
        }
        return 0;
    }

}
