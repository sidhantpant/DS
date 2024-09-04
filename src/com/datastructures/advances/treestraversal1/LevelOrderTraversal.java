package com.datastructures.advances.treestraversal1;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    void levelOrderTraversal(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size() > 0){
            TreeNode temp = queue.peek();
            queue.remove();
            System.out.println(temp.data);
            if( temp.leftTree != null){
                queue.add(temp.leftTree);
            }
            if(temp.rightTree!=null){
                queue.add(temp.rightTree);
            }
        }
    }

    void inorderTraversal(TreeNode root){
        if(root == null){
            return ;
        }
        inorderTraversal(root.leftTree);
        System.out.println(root.data);
        inorderTraversal(root.rightTree);
    }

    TreeNode addElementToTree(TreeNode A, int value) {

        if (A == null) {
            A = new TreeNode(value);
            return A;
        }
        if (value < A.data) {
            A.leftTree = addElementToTree(A.leftTree, value);
        } else if(value>A.data){
            A.rightTree = addElementToTree(A.rightTree, value);
        }

        return A;
    }

    public static void main(String[] args) {
        LevelOrderTraversal lOT = new LevelOrderTraversal();
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
//        treeNode = lOT.addElementToTree(treeNode,4);
//        treeNode= lOT.addElementToTree(treeNode,5);
//        treeNode = lOT.addElementToTree(treeNode,3);
//        treeNode=lOT.addElementToTree(treeNode,1);
//        treeNode=lOT.addElementToTree(treeNode,7);
//        treeNode=lOT.addElementToTree(treeNode,12);
//        treeNode=lOT.addElementToTree(treeNode,9);
//        treeNode=lOT.addElementToTree(treeNode,19);

        lOT.inorderTraversal(treeNode);
        System.out.println("==");
        lOT.levelOrderTraversal(treeNode);

    }
}
