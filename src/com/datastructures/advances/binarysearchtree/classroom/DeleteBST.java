package com.datastructures.advances.binarysearchtree.classroom;

import com.datastructures.advances.treestraversal1.TreeNode;

public class DeleteBST {

    TreeNode deleteNode(TreeNode root, int T) {

        if (root.data > T) {
            root.leftTree = deleteNode(root.leftTree, T);
        } else if (root.data < T) {
            root.rightTree = deleteNode(root.rightTree, T);
        } else {
            // if leaf node is null
            if(root.leftTree == null && root.rightTree == null){
                return null;
            }
            if( root.leftTree == null){
                root = root.rightTree;
            }
            else if( root.rightTree == null){
                root = root.leftTree;
            }else{
                int v = max(root.leftTree);
                root.data = v;
                root.leftTree = deleteNode(root.leftTree,v);
            }

        }
        return root;

    }

    int max(TreeNode current){

        while(current.rightTree!=null){
            current = current.rightTree;
        }
        return current.data;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.addBinarySearchTree();
        DeleteBST deleteBST = new DeleteBST();
        TreeNode tn = deleteBST.deleteNode(treeNode,3);
        System.out.println(tn);
    }
}
