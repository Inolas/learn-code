package com.inolas.classes;

import sun.reflect.generics.tree.Tree;

import java.util.Queue;

public class TreeNode
{
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) {
        val = x;
    }

    /*
    * Since InOrder is the most commonly used tree serializer;
    * Overriding toString method to return InOrder list
    * */
    @Override
    public String toString(){
        String InOrder = "";
        return InOrder;
    }

    /*
    * Print tree as a tree with /, \, etc.
    * To do this we need to traverse the tree in level order(BFS).
    * */
    public String printSTree(TreeNode root){
        String s = "";
        if(root == null){
            return "\n";
        }
        TreeNode current = root;

        while(current.left != null || current.right != null){

            if (current.left == null)
                ;
            if (current.right == null)
                ;

            current = current.left;
        }

        return s;
    }

    public String printPreorder(TreeNode root){

        String treePreorder="";

        if(root == null)
            treePreorder += "null";

        System.out.print(root.val);
        treePreorder += root.val;

        if(root.left != null){
            printPreorder(root.left);
        }

        if(root.right != null){
            printPreorder(root.right);
        }

        return treePreorder;
    }


}
