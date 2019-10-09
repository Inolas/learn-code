package com.inolas.tests.classes;

import com.inolas.classes.TreeNode;
import org.junit.Test;

public class TreeNodeTest
{
    TreeNode tree = new TreeNode();
    @Test
    public void createTree(){
        TreeNode tn = tree.createTree();
        System.out.println(tree.printSTree(tn));
    }

    @Test
    public void printPreOrderTest(){
        TreeNode tn = new TreeNode(1);
        tn.right = new TreeNode(3);
        tn.left = new TreeNode(2);
        //tn.left.right = new TreeNode(5);
        tn.left.left = new TreeNode(4);
        tn.right.right = new TreeNode(7);
        tn.right.left = new TreeNode(6);

//        System.out.println(tn.printSTree(tn));
        System.out.println(tn.printPreorder(tn));
    }
}
