package com.inolas.classes;

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
