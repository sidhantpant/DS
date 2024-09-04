package com.datastructures.advances.treestraversal1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderIteratively {


    int[] iterativePrintingOfStack(TreeNode root){
        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> l1 = new ArrayList<>();

        while (stack.size()>0 || curr!=null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.leftTree;
            }
            curr = stack.peek();
            stack.pop();
            System.out.print(curr.data +" ");
            l1.add(curr.data);
            curr = curr.rightTree;
        }

        int[] T = new int[l1.size()];
        for(int i=0;i < l1.size();i++){
            T[i] = l1.get(i);
        }
        return T;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.addElementToTree1();
        InorderIteratively iot = new InorderIteratively();
      //  iot.iterativePrintingOfStack(treeNode);
        iot.iterativePrintingOfStack(treeNode);
    }

}
