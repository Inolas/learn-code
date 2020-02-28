package com.inolas.tests.ctci;

import com.inolas.solutions.ctci.c4_1_RouteBetweenNodes;
import org.junit.Test;

import static org.junit.Assert.*;

public class c4_1_RouteBetweenNodesTest
{
    c4_1_RouteBetweenNodes rbnt = new c4_1_RouteBetweenNodes();
    @Test
    public void test1GraphArray(){
        int[][] graph = {
                {0,1,0,1,0},
                {0,0,1,0,0},
                {0,0,0,1,0},
                {1,0,0,0,0},
                {0,0,0,1,0}
        };
        int start = 0;  int end = 3;
        boolean actual = rbnt.findRoute(graph, start, end);
        assertEquals(true, actual);
    }
    @Test
    public void test2GraphArray(){
        int[][] graph = {{0,1,0,0,0},{0,0,1,0,0},{0,0,0,1,0},{1,0,0,0,0},{0,0,0,1,0}};
        int start = 0;  int end = 4;
        boolean actual = rbnt.findRoute(graph, start, end);
        assertEquals(false, actual);
    }
}