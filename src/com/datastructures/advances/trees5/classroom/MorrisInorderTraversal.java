package com.datastructures.advances.trees5.classroom;

import com.datastructures.advances.treestraversal1.TreeNode;

public class MorrisInorderTraversal {

    void morrisInorderTraversal(TreeNode root) {

        TreeNode curr = root;
        while (curr != null) {
            if (curr.leftTree == null) {
                System.out.print(curr.data + "->");
                curr = curr.rightTree;
            } else {
                TreeNode temp = curr.leftTree;
                while (temp.rightTree != null && temp.rightTree != curr) {
                    temp = temp.rightTree;
                }
                if (temp.rightTree == null) {
                    temp.rightTree = curr;
                    curr = curr.leftTree;
                } else {
                    temp.rightTree = null;
                    System.out.print(curr.data + "->");
                    curr = curr.rightTree;
                }
            }
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.addBinarySearchTree();
        MorrisInorderTraversal mit = new MorrisInorderTraversal();
        mit.morrisInorderTraversal(treeNode);
    }

}
