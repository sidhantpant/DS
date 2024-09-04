package com.datastructures.advances.binarysearchtree.assignment;

import com.datastructures.advances.treestraversal1.TreeNode;

public class Solution1 {

    boolean isValidBST(TreeNode root,int s ,int e) {

        if (root == null) {
            return true;
        }

        if ( s <= root.data && root.data <= e) {

            boolean l = isValidBST(root.leftTree,s,root.data-1);
            boolean r = isValidBST(root.rightTree,root.data+1,e);
            return l && r;
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.leftTree = new TreeNode(8);
        treeNode.leftTree.leftTree = new TreeNode(6);
        treeNode.rightTree = new TreeNode(12);
        treeNode.rightTree.rightTree = new TreeNode(14);
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.isValidBST(treeNode,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }

}
