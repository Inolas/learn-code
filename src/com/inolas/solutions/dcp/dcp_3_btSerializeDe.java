package com.inolas.solutions.dcp;

import com.inolas.classes.TreeNode;

public class dcp_3_btSerializeDe
{
    public static String serialize(TreeNode root) {
        String serialTree="";

        if(root == null)
        {
            return "null, ";
        }
        serialTree += root.val+", ";

        if(serialize(root.left) != null){
            serialTree += serialize(root.left);
        }
        if(serialize(root.right) != null){
            serialTree += serialize(root.right);
        }

//        }
//        else if (root.left == null)
//            serialTree += "null";

//        if(root.right != null){
//            serialize(root.right);
//        }
//        else if (root.right == null)
//            serialTree += "null";

        return serialTree;
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        serialize(root);
        System.out.println(serialize(root));
    }
}
