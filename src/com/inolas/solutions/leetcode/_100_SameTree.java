package com.inolas.solutions.leetcode;

import com.inolas.classes.TreeNode;

public class _100_SameTree
{
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null)  return true;
        if(p == null || q == null)  return false;
        if(p.val == q.val)          return true;

        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}