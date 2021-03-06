package com.inolas.solutions.ctci;

import com.inolas.classes.TreeNode;

/*
* List of Depths: Given a binary tree, design an algorithm
*  which creates a linked list of all the nodes at each depth
* (e.g., if you have a tree with depth D, you'll have D linked lists).
* */

public class $c4_2_MinimalTree
{
    public static TreeNode minimalTree(int[] array){
        return createBST(array, 0, array.length - 1);
    }
    public static TreeNode createBST(int[] array, int start, int end){
        int mid = (start + end) / 2;

        if(end < start){
            return null;
        }

        TreeNode tn = new TreeNode(array[mid]);
        tn.left = createBST(array, start, mid - 1);
        tn.right = createBST(array, mid + 1, end);

        return tn;
    }

    public static void main(String[] args)
    {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        TreeNode tn = minimalTree(array);
        tn.printPreorder(tn);
    }
}

