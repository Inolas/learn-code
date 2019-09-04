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

    public TreeNode(int[] ints)
    {
        insertLevelOrder(ints, this, 0);
    }

    public TreeNode insertLevelOrder(int[] ints, TreeNode tn, int i)
    {
        tn = new TreeNode(ints[i]);
        tn.left = insertLevelOrder(ints, tn.left, 2 * i + 1);
        tn.right = insertLevelOrder(ints, tn.right, 2 * i + 2);

        return tn;
    }
    /*
    * Creates a basic Tree for any example
    * */
    public TreeNode createTree(){
        TreeNode tn = new TreeNode(1);
        tn.right = new TreeNode(3);
        tn.left = new TreeNode(2);
        tn.left.right = new TreeNode(5);
        tn.left.left = new TreeNode(4);
        tn.right.right = new TreeNode(7);
        tn.right.left = new TreeNode(6);

        return tn;
    }

    /*
    * Since InOrder is the most commonly used tree serializer;
    * Overriding toString method to return InOrder list
    * */
    @Override
    public String toString(){
//        String InOrder = "";
        return this.val+"";
    }

    /*
    * Print tree as a tree with /, \, etc.
    * To do this we need to traverse the tree in level order(BFS).
    * */
    public String printSTree(TreeNode root){
        String s = "str";
        if(root == null){
            return "\n";
        }
        TreeNode current = root;

        while(current.left != null || current.right != null){

            if (current.left == null)


                ;
            if (current.right == null)
                ;
            s =;
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
/*
......1         spaces(s) = h*2
...../.\        s--; if(n>5){s--; str+="/"+ interS + "\"}
..../...\       f
...2.....3      k
../.\.../.\     l
.4...5.6...7

......1
...../.\
....2...3
.../.\
..4...5
 */