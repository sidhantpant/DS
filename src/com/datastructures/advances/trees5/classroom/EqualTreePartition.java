package com.datastructures.advances.trees5.classroom;

public class EqualTreePartition {

    boolean ans = false;

    boolean equalPartition(TreeNode treeNode) {

        int sum = sumOfNodes(treeNode);

        if (sum % 2 != 0) {
            return false;
        }

        int s = validate(treeNode, sum);
        return ans;

    }

    int validate(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int l = validate(root.left, sum);
        int r = validate(root.right, sum);
        if (l == sum / 2 || r == sum / 2) {
            ans = true;
        }
        return l + r + root.data;
    }

    int sumOfNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = sumOfNodes(root.left);
        int r = sumOfNodes(root.right);
        return root.data + l + r;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
//        treeNode.left.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(6);
//        treeNode.left.right.left = new TreeNode(3);
//        treeNode.left.right.right  = new TreeNode(4);
//        treeNode.left.right.right.right  = new TreeNode(1);
        treeNode.right = new TreeNode(7);
        treeNode.right.left = new TreeNode(5);
        treeNode.right.right= new TreeNode(6);

        EqualTreePartition equalTreePartition = new EqualTreePartition();
        equalTreePartition.equalPartition(treeNode);

    }
}
