package com.inolas.classes;

/*
* Methods to be completed: height of the tree, number of elements in the tree
* */

public class TreeNode
{
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(){}
    public TreeNode(int x) {
        val = x; left = null; right = null;
    }
    public TreeNode(int x, TreeNode nodeLeft, TreeNode nodeRight){
        val = x; left = nodeLeft; right = nodeRight;
    }
    public StringBuilder s = new StringBuilder();

    public TreeNode(int[] ints)
    {
        insertLevelOrder(ints, this, 0);
    }

    /*
    * ints[] - array of ints to insert in the tree
    * tn - head of tree node
    * i - index of the node that will be created
    * */
    public TreeNode insertLevelOrder(int[] ints, TreeNode tn, int i)
    {
        if(ints.length > i)
        {
            tn = new TreeNode(ints[i]);
            tn.left = insertLevelOrder(ints, tn.left, 2 * i + 1);
            tn.right = insertLevelOrder(ints, tn.right, 2 * i + 2);
        }

        return tn;
    }

    /*
    * Creates a basic Tree for any example
    * */
    public TreeNode createTree(){
        this.val = 1;
        this.right = new TreeNode(3);
        this.left = new TreeNode(2);
        this.left.right = new TreeNode(5);
        this.left.left = new TreeNode(4);
        this.right.right = new TreeNode(7);
        this.right.left = new TreeNode(6);
        this.left.left.left = new TreeNode(8);
        this.left.left.right = new TreeNode(9);
        this.left.right.left = new TreeNode(10);
        this.left.right.right = new TreeNode(11);

        return this;
    }

    /*
    * Since InOrder is the most commonly used tree serializer;
    * Overriding toString method to return InOrder list
    * */
    @Override
    public String toString(){
//        String InOrder = "";
        return this.val+"";
    }

    /*
    * Returns the height of the Tree
    * */
    public int length(){
        int len=0;
        while (this != null){

        }
        return len;
    }

    /*
    * Print tree as a tree with /, \, etc.
    * To do this we need to traverse the tree in level order(BFS).
    * */
    public String printSTree(TreeNode root){
        TreeNode parent;
        int level = 0;
        if(root == null)
            return "";
        Queue<TreeNode> bfsTree = new Queue();

        bfsTree.enqueue(root);
        s.append(root.toString()+"\n");

        while(bfsTree.front != null){
            parent = bfsTree.dequeue();
            if(parent.left != null)
            {
                bfsTree.enqueue(parent.left);
                s.append("" + parent.left.toString());
            }
            if(parent.right != null)
            {
                bfsTree.enqueue(parent.right);
                s.append(" " + parent.right.toString());
            }
            level++;
            /*
            * bitwise operator to check if the number
            * of elements in the tree is of the power 2.
            * */

            if( (bfsTree.length() & (bfsTree.length() - 1)) == 0)
                s.append("\n");
            else
                s.append("\t");
        }
        return s.toString();
    }

    /*
    * print the Tree in PRE ORDER
    * */
    public String printPreorder(TreeNode root){

        if(root == null)
            s.append("null");

//        System.out.print(root.val);
        s.append(root.val);
        if(root.left != null){
            printPreorder(root.left);
        }
        if(root.right != null){
            printPreorder(root.right);
        }

        return s.toString();
    }
}
/*
......1         spaces(s) = h*2
...../.\        s--; if(n>5){s--; str+="/"+ interS + "\"}
..../...\       f
...2.....3      k
../.\.../.\     l
.4...5.6...7

......1
...../.\
....2...3
.../.\
..4...5
 */