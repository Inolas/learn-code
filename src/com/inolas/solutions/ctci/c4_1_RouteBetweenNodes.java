package com.inolas.solutions.ctci;

import com.inolas.classes.Graph;
import com.inolas.classes.GraphNode;

import java.util.HashSet;

public class c4_1_RouteBetweenNodes
{
    public boolean findRoute(int[][] graph, int start, int end){
        HashSet hm = new HashSet();
        hm.add(start);
        for (int i = 0; i < graph.length; i++)
        {
            for (int j = 0; j < graph[0].length; j++)
            {
                if(graph[i][j] == 1){
                    if(hm.contains(i)){
                        hm.add(j);
                    }
                }
            }
        }
        if(hm.contains(end)){
            return true;
        }
        return false;
    }

    public boolean findRouteGraphNode(GraphNode root, GraphNode start, GraphNode end){
        HashSet hm = new HashSet();
        hm.add(start);
        GraphNode gn = root;
        while(gn!=null)
        {
            for (GraphNode child: gn.children)
            {
                hm.add(child);
            }
        }
        if(hm.contains(end)){
            return true;
        }

        return false;
    }
}
