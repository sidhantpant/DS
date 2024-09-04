package com.datastructures.advances.trees5.classroom;


import java.util.LinkedList;
import java.util.Queue;

public class FillNext {

    void fillTreeLevelOrder1(TreeNode root) {

        if (root == null) {
            return ;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int N = q.size();
            int index = 0;
            for (int i = 1; i <= N; i++) {
                TreeNode temp = q.poll();
                index++;
                if (index < N) {
                    temp.next = q.peek();
                } else {
                    temp.next = null;
                }

                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }

    }

    TreeNode fillTreeLevelOrder(TreeNode root) {

        if(root == null){
            return root;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty() ) {
            int size = q.size();
            int index = 0 ;
            while(index < size){
                TreeNode temp = q.poll();
                index++;
                if(index < size){
                    temp.next = q.peek();
                }else{
                    temp.next = null;
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
        return root;
    }

    void fillNextNoSpaceComplexity(TreeNode root) {

        TreeNode t = root;
        while (t.next != null) {
            TreeNode f = t;
            while (t != null) {
                t.left.next = t.right;
                if (t.next != null) {
                    t.right.next = t.next.left;
                }
                t = t.next;
            }
            t = f.left;
        }
    }

    public void connect(TreeNode root) {

        TreeNode dummy = new TreeNode(-1);
        TreeNode temp = dummy;
        while(root !=null){
            if(root.left != null){
                temp.next = root.left;
                temp = temp.next;
            }
            if(root.right != null){
                temp.next = root.right;
                temp = temp.next;
            }
            root = root.next;
            if(root == null){
                root = dummy.next;
                dummy.next = null;
                temp = dummy;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);

        FillNext fillNext = new FillNext();
//        fillNext.fillTreeLevelOrder(treeNode);
//        fillNext.fillTreeLevelOrder1(treeNode);
        fillNext.fillNextNoSpaceComplexity(treeNode);
        fillNext.connect(treeNode);
    }


}
