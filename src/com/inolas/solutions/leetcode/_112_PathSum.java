package com.inolas.solutions.leetcode;

import com.inolas.classes.TreeNode;

public class _112_PathSum
{
    public boolean isPathSum(TreeNode node, int sum){

        if(node == null)
            return false;
        if(sum == 0 && node.left==null && node.right==null)
            return true;
        if(sum < 0 )
            return false;

        return isPathSum(node.left, sum - node.val)
                || isPathSum(node.right, sum - node.val);
    }
}
