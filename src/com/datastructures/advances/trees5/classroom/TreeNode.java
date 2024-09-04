package com.datastructures.advances.trees5.classroom;

public class TreeNode {

    public int data;
    public TreeNode left;
    public TreeNode right;
    public TreeNode next ;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.next = null;
    }

    public static TreeNode addElementToTree() {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(12);
        treeNode.left.right = new TreeNode(-9);
        treeNode.left.right.left = new TreeNode(4);
        treeNode.right = new TreeNode(6);
        treeNode.right.left = new TreeNode(-1);
        treeNode.right.left.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(10);
        treeNode.right.right.left = new TreeNode(9);
        treeNode.right.right.left.right = new TreeNode(19);
        return treeNode;
    }

    public static TreeNode addElementToTree1() {
        TreeNode treeNode = new TreeNode(9);
        treeNode.left = new TreeNode(6);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.left.right = new TreeNode(11);
        treeNode.left.left.left = new TreeNode(7);
        treeNode.left.left.left.right = new TreeNode(14);
        treeNode.left.right = new TreeNode(3);
        treeNode.left.right.left = new TreeNode(5);
        treeNode.left.right.left.right = new TreeNode(19);
        treeNode.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(8);
        treeNode.right.right = new TreeNode(1);
        treeNode.right.right.left = new TreeNode(12);
        return treeNode;
    }

    public static TreeNode addBinarySearchTree(){
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(0);
        treeNode.left.left = new TreeNode(-1);
        treeNode.left.right = new TreeNode(3);
        treeNode.right = new TreeNode(10);
        treeNode.right.left = new TreeNode(7);
        treeNode.right.left.left = new TreeNode(6);
        treeNode.right.left.right = new TreeNode(9);
        treeNode.right.right = new TreeNode(15);
        return treeNode;

    }


}
