package com.inolas.tests.practice_problems.za;

import com.inolas.classes.LinkedList;
import com.inolas.solutions.practice_problems.za._ALNode;
import org.junit.Test;


import static org.junit.Assert.*;

public class _copyRandomLinkedListsTest
{
    @Test
    public void test1(){
        _ALNode node3 = new _ALNode(3);
        _ALNode node2 = new _ALNode(2, node3);
        _ALNode alNode = new _ALNode(1, node2, node3);

        System.out.println((alNode.deepCopy(alNode).toString()));
    }
}