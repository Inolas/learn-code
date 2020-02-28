package com.inolas.classes;

import java.util.List;

public class GraphNode
{
    public int val;
    public List<GraphNode> children;

    public GraphNode(){}
    public GraphNode(int x) {
        val = x;
    }
    public GraphNode(GraphNode child){
        this.children.add(child);
    }
    public GraphNode(int[] children){
        for (int i:children){
            this.children.add(new GraphNode(i));
        }
    }
    public GraphNode(List<GraphNode> children){
        for (GraphNode gn:children){
            this.children.add(gn);
        }
    }
}
