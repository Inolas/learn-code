package com.inolas.tests.leetcode;

import com.inolas.classes.TreeNode;
import com.inolas.solutions.leetcode._100_SameTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class _100_SameTreeTest
{

    @Test
    public void isSameTree()
    {
        _100_SameTree sameTree = new _100_SameTree();
        TreeNode p = new TreeNode(new int[]{1, -1, 2, 4, -1, -1, 3});
        TreeNode q = new TreeNode(new int[]{1, -1, 4, 2, -1, -1, 3});

        boolean actual = sameTree.isSameTree(p, q);

        assertEquals(true, actual);
    }
}