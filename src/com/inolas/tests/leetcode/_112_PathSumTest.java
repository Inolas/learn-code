package com.inolas.tests.leetcode;

import com.inolas.classes.TreeNode;
import com.inolas.solutions.leetcode._112_PathSum;
import org.junit.Test;

import static org.junit.Assert.*;

public class _112_PathSumTest
{
    _112_PathSum ps = new _112_PathSum();

    @Test
    public void test1(){
        /*
        *       2
        *      / \
        *     5   1
        *   / \    \
        *  9   2    7
        * */
        TreeNode tn1 = new TreeNode(5, new TreeNode(9), new TreeNode(2));
        TreeNode tn2 = new TreeNode(1, null, new TreeNode(7));
        TreeNode tn = new TreeNode(2, tn1, tn2);

        System.out.println(ps.isPathSum(tn, 9));
    }
}