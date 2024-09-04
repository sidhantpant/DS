package com.datastructures.advances.binarysearchtree.classroom;

import com.datastructures.advances.treestraversal1.TreeNode;

public class InsertBST {

    TreeNode insertInBST(TreeNode root,int K){

        if(root == null){
            root = new TreeNode(K);
            return root;
        }
        TreeNode temp = root;

        while (root != null) {

            if (root.data > K) {
                if (root.leftTree == null) {
                    root.leftTree = new TreeNode(K);
                    break;
                }
                root = root.leftTree;
            } else {
                if (root.rightTree == null) {
                    root.rightTree = new TreeNode(K);
                    break;
                }
                root = root.rightTree;
            }
        }
        return temp;
    }

   static void printTree(TreeNode node, String prefix)
    {
        if(node == null) return;

        System.out.println(prefix + " + " + node.data);
        printTree(node.leftTree , prefix + " ");
        printTree(node.rightTree , prefix + " ");
    }

    public static void main(String[] args) {
        InsertBST insertBST = new InsertBST();
        TreeNode treeNode = new TreeNode(4);
        treeNode = insertBST.insertInBST(treeNode,0);
        treeNode=insertBST.insertInBST(treeNode,10);
        treeNode= insertBST.insertInBST(treeNode,-1);
        treeNode=insertBST.insertInBST(treeNode,3);
        treeNode=insertBST.insertInBST(treeNode,7);
        treeNode=insertBST.insertInBST(treeNode,15);
        treeNode=insertBST.insertInBST(treeNode,2);
        treeNode=insertBST.insertInBST(treeNode,6);
        treeNode=insertBST.insertInBST(treeNode,9);
        System.out.println(treeNode);
        printTree(treeNode," ");

    }
}
