package com.datastructures.advances.trees5.classroom;

import apple.laf.JRSUIUtils;
import com.datastructures.advances.treetraversal2.classroom.TreeNode;

public class InvertBinaryTree {

    void invert(TreeNode root){
        if(root == null ){
            return;
        }
        invert(root.leftTree);
        invert(root.rightTree);
        TreeNode temp = root.leftTree;
        root.leftTree = root.rightTree;
        root.rightTree = temp;

    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(8);
        treeNode.leftTree = new TreeNode(2);
        treeNode.leftTree.leftTree = new TreeNode(3);
        treeNode.rightTree = new TreeNode(10);
        treeNode.rightTree.leftTree = new TreeNode(6);
        treeNode.rightTree.rightTree = new TreeNode(9);
        treeNode.rightTree.rightTree.leftTree = new TreeNode(3);
        InvertBinaryTree ibt = new InvertBinaryTree();
        ibt.invert(treeNode);
    }
}
