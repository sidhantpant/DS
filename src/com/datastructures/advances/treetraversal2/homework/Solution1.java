package com.datastructures.advances.treetraversal2.homework;

import com.datastructures.advances.treetraversal2.classroom.TreeNode;

import java.util.*;

public class Solution1 {

    public int[][] zigzagLevelOrder(TreeNode A) {

        Queue<TreeNode> queue = new LinkedList<>();
        boolean isEven = false;
        List<List<Integer>> outerList = new ArrayList<>();
        while(queue.size()>0){
            int N = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 1 ; i <= N ;i++){
                TreeNode temp = queue.peek();
                queue.remove();
                list.add(temp.data);
                if(temp.leftTree!= null){
                    queue.add(temp.leftTree);
                }

                if(temp.rightTree!= null){
                    queue.add(temp.rightTree);
                }
            }
            if(isEven){
                Collections.reverse(list);
                isEven = false;
            }else{
                isEven = true;
            }
            outerList.add(list);
        }
        return outerList.stream()
                .map( l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
    }

    public ArrayList<ArrayList<Integer>> zigzagLevelOrder1(TreeNode A) {
        //using 2 stack approach
        Stack<TreeNode> oddStack = new Stack<>();
        Stack<TreeNode> evenStack = new Stack<>();
        oddStack.push(A);
        ArrayList<ArrayList<Integer>> zigzagLevel = new ArrayList<>();
        while(!oddStack.isEmpty() || !evenStack.isEmpty()){

            int N = oddStack.size();
            ArrayList<Integer> level = new ArrayList<>();
            while(oddStack.size() > 0){
                TreeNode temp =  oddStack.pop();
                level.add(temp.data);

                if(temp.leftTree!= null){
                    evenStack.add(temp.leftTree);
                }

                if(temp.rightTree!=null){
                    evenStack.push(temp.rightTree);
                }

            }
//            if(level.size()>0){
                zigzagLevel.add(level);
//            }

            level = new ArrayList<>();

            while(evenStack.size() > 0){
                TreeNode temp = evenStack.pop();
                level.add(temp.data);
                if(temp.rightTree!= null){
                    oddStack.add(temp.rightTree);
                }

                if(temp.leftTree!= null){
                    oddStack.add(temp.leftTree);
                }
            }
//            if(level.size()>0){
                zigzagLevel.add(level);
//            }
        }
        return zigzagLevel;
    }

    public static void main(String[] args) {
        TreeNode treeNode = addElementToTree();
        Solution1 sol = new Solution1();
//        sol.zigzagLevelOrder(treeNode);
        sol.zigzagLevelOrder1(treeNode);
    }

    public static TreeNode addElementToTree() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.leftTree = new TreeNode(2);
        treeNode.leftTree.leftTree = new TreeNode(4);
        treeNode.leftTree.rightTree = new TreeNode(5);
        treeNode.rightTree = new TreeNode(3);
        treeNode.rightTree.leftTree = new TreeNode(6);
        treeNode.rightTree.rightTree = new TreeNode(7);
        return treeNode;
    }
}
