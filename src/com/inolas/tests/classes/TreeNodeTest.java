package com.inolas.tests.classes;

import com.inolas.classes.TreeNode;
import org.junit.Test;

public class TreeNodeTest
{
    TreeNode tree;
    @Test
    public void createTree(){
        TreeNode tn = tree.createTree();
        tree.printSTree(tn);
    }
}
