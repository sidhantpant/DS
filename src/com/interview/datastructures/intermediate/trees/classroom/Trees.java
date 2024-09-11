package com.interview.datastructures.intermediate.trees.classroom;

import static java.lang.Math.max;

public class Trees {

    public static void main(String[] args) {
        Tree tree1 = new Tree(10);
        tree1.left = new Tree(5);
        tree1.left.left = new Tree(2);
        tree1.left.right = new Tree(7);
        tree1.left.right.left = new Tree(6);
        tree1.left.right.right = new Tree(8);

        tree1.right = new Tree(20);
        tree1.right.right = new Tree(22);
        tree1.right.right.right = new Tree(50);
        tree1.right.right.left = new Tree(21);
        //  tree1.right.right.left.left = new Tree(5);

        Trees t = new Trees();
        System.out.println("PREORDER");
        t.preorder(tree1);
        System.out.println(" ");
        System.out.println("INORDER");
        t.inorder(tree1);
        System.out.println(" ");
        System.out.println("POSTORDER");
        t.postorder(tree1);

        System.out.println(t.height(tree1));
    }

    public void preorder(Tree root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + ",");
        preorder(root.left);
        preorder(root.right);

    }

    public void inorder(Tree root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + ",");
        inorder(root.right);

    }

    public void postorder(Tree root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + ",");

    }

    public int height(Tree root) {
        if (root == null) {
            return 0;
        }
        int lh = 1 + height(root.left);
        int rh = 1 + height(root.right);
        System.out.println("lh" + lh + "rh" + rh);
        return max(lh, rh);
    }


}