package com.inolas.solutions.ctci;

import com.inolas.classes.TreeNode;
import java.util.ArrayList;
import java.util.List;

/*
* Approach 1: Traverse the tree using InOrder traversal and store the values in a data structure.
*               If the tree is a BST the data structure should be in ascending order.
*
* Approach 2: check of value of left node is minimum and value of right node is max
* */

public class c4_5_ValidateBinarySearchTree
{
    public boolean validateBST(TreeNode root){
        List<Integer> inOrderList = new ArrayList<>();
        inOrderList = inOrderTraversal(root, inOrderList);
        for (int i = 0; i < inOrderList.size(); i++)
        {
            if(inOrderList.get(i) > inOrderList.get(i+1))
                return false;
        }
        return true;
    }
    public List<Integer> inOrderTraversal(TreeNode root, List<Integer>list){
        if(root==null)
            return null;
        if(root.left != null)
            list = inOrderTraversal(root.left, list);
        list.add(root.val);
        if(root.right != null)
            list = inOrderTraversal(root.right, list);

        return list;
    }
}
