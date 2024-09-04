package com.datastructures.advances.trees5.classroom;

import com.datastructures.advances.treetraversal2.classroom.TreeNode;

public class Sum {

    int sum(TreeNode root){
        if(root == null){
            return 0;
        }
        return root.data + sum(root.leftTree) + sum(root.rightTree);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.leftTree = new TreeNode(3);
        treeNode.leftTree.leftTree = new TreeNode(4);
        treeNode.leftTree.rightTree = new TreeNode(6);
        treeNode.rightTree = new TreeNode(7);
        treeNode.rightTree.rightTree = new TreeNode(6);
         Sum sum = new Sum();
         sum.sum(treeNode);
    }

}
