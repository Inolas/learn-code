package com.inolas.solutions.algorithms;

import com.inolas.classes.StackNode;

import java.util.Arrays;

public class _dfs
{
    public static int[] DFStraversal(int[][] graph){
        StackNode<Integer> stack = new StackNode<>();
//        boolean[] visited = new boolean[graph.length];
        int[] visited = new int[graph.length];
        int startNode = 1, visitCount = 1;

        Arrays.fill(visited, 0);

        stack.push(startNode);
        visited[startNode] = visitCount++;
        while(!stack.isEmpty()){
            int adjNodes = 0;       //0-all adjacent nodes visited
            int top = stack.peek();
            for(int i=0; i< graph.length; i++){
                if(visited[i] == 0  && graph[top][i]==1)
                {
                    stack.push(i);
                    visited[i] = visitCount++;
                    adjNodes = 1;
                    break;
                }
            }
            if(adjNodes == 0){
                stack.pop();
            }
        }
        return visited;
    }

    public static void main(String[] args)
    {
        int[][] graph = {{0,1,0,1,1},{0,0,1,0,0},{0,0,0,1,0},{0,0,0,0,0},{0,0,0,1,0}};
        int[][] graph1 = {{0,1,1,0},{0,0,1,0},{1,0,0,1},{0,0,0,1}};
        int[] visited = DFStraversal(graph1);

    }
}
