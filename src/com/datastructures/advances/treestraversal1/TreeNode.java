package com.datastructures.advances.treestraversal1;

public class TreeNode {

    public int data;
    public TreeNode leftTree;
    public TreeNode rightTree;

    public TreeNode(int data) {
        this.data = data;
        this.leftTree = null;
        this.rightTree = null;
    }

    public static TreeNode addElementToTree() {
        TreeNode treeNode = new TreeNode(5);
        treeNode.leftTree = new TreeNode(12);
        treeNode.leftTree.rightTree = new TreeNode(-9);
        treeNode.leftTree.rightTree.leftTree = new TreeNode(4);
        treeNode.rightTree = new TreeNode(6);
        treeNode.rightTree.leftTree = new TreeNode(-1);
        treeNode.rightTree.leftTree.leftTree = new TreeNode(15);
        treeNode.rightTree.rightTree = new TreeNode(10);
        treeNode.rightTree.rightTree.leftTree = new TreeNode(9);
        treeNode.rightTree.rightTree.leftTree.rightTree = new TreeNode(19);
        return treeNode;
    }

    public static TreeNode addElementToTree1() {
        TreeNode treeNode = new TreeNode(9);
        treeNode.leftTree = new TreeNode(6);
        treeNode.leftTree.leftTree = new TreeNode(2);
        treeNode.leftTree.leftTree.rightTree = new TreeNode(11);
        treeNode.leftTree.leftTree.leftTree = new TreeNode(7);
        treeNode.leftTree.leftTree.leftTree.rightTree = new TreeNode(14);
        treeNode.leftTree.rightTree = new TreeNode(3);
        treeNode.leftTree.rightTree.leftTree = new TreeNode(5);
        treeNode.leftTree.rightTree.leftTree.rightTree = new TreeNode(19);
        treeNode.rightTree = new TreeNode(4);
        treeNode.rightTree.leftTree = new TreeNode(8);
        treeNode.rightTree.rightTree = new TreeNode(1);
        treeNode.rightTree.rightTree.leftTree = new TreeNode(12);
        return treeNode;
    }

    public static TreeNode addBinarySearchTree(){
        TreeNode treeNode = new TreeNode(4);
        treeNode.leftTree = new TreeNode(0);
        treeNode.leftTree.leftTree = new TreeNode(-1);
        treeNode.leftTree.rightTree = new TreeNode(3);
        treeNode.rightTree = new TreeNode(10);
        treeNode.rightTree.leftTree = new TreeNode(7);
        treeNode.rightTree.leftTree.leftTree = new TreeNode(6);
        treeNode.rightTree.leftTree.rightTree = new TreeNode(9);
        treeNode.rightTree.rightTree = new TreeNode(15);
        return treeNode;

    }


}
