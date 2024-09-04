package com.datastructures.advances.treestraversal1;

public class TreeSize {

    int sizeOfTree(TreeNode root){// total no of nodes is the size
        if(root == null){
            return 0;
        }
        int l = sizeOfTree(root.leftTree);
        int r = sizeOfTree(root.rightTree);
        return l+r+1;
    }

    public static void main(String[] args) {
        TreeSize treeSize = new TreeSize();
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

        System.out.println(treeSize.sizeOfTree(treeNode));
    }
}
