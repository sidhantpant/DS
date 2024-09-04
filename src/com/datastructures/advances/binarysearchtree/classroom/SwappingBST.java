package com.datastructures.advances.binarysearchtree.classroom;

import com.datastructures.advances.treestraversal1.TreeNode;

public class SwappingBST {

    TreeNode prev;
    TreeNode first;
    TreeNode second;
    void inorder(TreeNode root){

        if(root == null){
            return;
        }
        inorder(root.leftTree);
        if(prev!= null && prev.data > root.data && first == null){
            first = prev;
            second = root;
        }else if(prev!=null && prev.data > root.data){
            second = root;
        }
        prev = root;
        inorder(root.rightTree);
    }

    void swap(TreeNode root){
        inorder(root);
        int temp= first.data;
        first.data = second.data;
        second.data = temp;
        System.out.println(root);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.leftTree = new TreeNode(5);
        treeNode.leftTree.leftTree = new TreeNode(3);
        treeNode.leftTree.rightTree = new TreeNode(14);
        treeNode.leftTree.rightTree.leftTree = new TreeNode(7  );

        treeNode.rightTree = new TreeNode(15);
        treeNode.rightTree.leftTree = new TreeNode(13);
        treeNode.rightTree.leftTree.rightTree = new TreeNode(9);
        treeNode.rightTree.rightTree = new TreeNode(20);
        treeNode.rightTree.rightTree.leftTree = new TreeNode(19);

        SwappingBST swappingBST = new SwappingBST();
        swappingBST.swap(treeNode);
    }
}
