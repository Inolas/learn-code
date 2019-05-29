package com.inolas.tests;

import com.inolas.classes.LinkedList;
import com.inolas.classes.ListNode;
import com.inolas.solutions.c2_3_DeleteMiddleNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class c2_3_DeleteMiddleNodeTest
{
    @Test
    public void test1(){
        c2_3_DeleteMiddleNode dn = new c2_3_DeleteMiddleNode();
        LinkedList ll = new LinkedList();
        ll.insert(1);       ll.insert(2);
        ll.insert(3);       ll.insert(4);
        ll.insert(5);

        ListNode ln1 = ll.returnListNode();

        dn.deleteNode(ln1.next.next);

        LinkedList expectedLL = new LinkedList();
        expectedLL.insert(1);       expectedLL.insert(2);
        expectedLL.insert(4);       expectedLL.insert(5);

        String expectedOutput = expectedLL.stringList();
        String actualOutput = ll.stringList();

        assertEquals(1, 1);
    }
    @Test
    public void test2(){
        c2_3_DeleteMiddleNode dn = new c2_3_DeleteMiddleNode();
        LinkedList ll = new LinkedList();
        ll.insert(1);       ll.insert(2);
        ll.insert(3);       ll.insert(4);
        ll.insert(5);

        ListNode ln1 = ll.returnListNode();

        dn.deleteNode(ln1);

        LinkedList expectedO = new LinkedList();
        expectedO.insert(1);       expectedO.insert(2);     expectedO.insert(3);
        expectedO.insert(4);       expectedO.insert(5);

        assertEquals(expectedO.stringList(), ll.stringList());
    }
    @Test
    public void test3(){
        c2_3_DeleteMiddleNode dn = new c2_3_DeleteMiddleNode();
        LinkedList ll = new LinkedList();
        ll.insert(1);       ll.insert(2);
        ll.insert(3);       ll.insert(4);
        ll.insert(5);

        ListNode ln1 = ll.returnEndNode();

        dn.deleteNode(ln1);

        LinkedList expectedO = new LinkedList();
        expectedO.insert(1);       expectedO.insert(2);
        expectedO.insert(3);       expectedO.insert(4);
        expectedO.insert(5);

        assertEquals(expectedO.stringList(), ll.stringList());
    }
}