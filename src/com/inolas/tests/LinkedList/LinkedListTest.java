package com.inolas.tests.LinkedList;

import com.inolas.classes.LinkedList;
import com.inolas.classes.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest
{
    @Test
    public void returnEndNodeTest(){
        LinkedList ll = new LinkedList();
        ll.insert(1);       ll.insert(2);
        ll.insert(3);       ll.insert(4);
        ll.insert(5);

        ListNode ln1 = ll.returnEndNode();

        assertEquals(5, ln1.data);
    }
    @Test
    public void stringListTest(){
        LinkedList ll = new LinkedList();
        ll.insert(1);       ll.insert(2);
        ll.insert(3);
        ll.insert(5);

        String expectedStr = "1->2->3->5";
        String actualStr = ll.stringList();

        assertEquals(expectedStr,actualStr);
    }

}