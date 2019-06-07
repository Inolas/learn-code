package com.inolas.tests;

import static com.inolas.solutions.c2_2_ReturnKthToLast.*;
import static org.junit.Assert.*;

import com.inolas.classes.LinkedList;
import com.inolas.classes.ListNode;
import org.junit.Test;

public class c2_2_ReturnKthToLastTest
{
    @Test
    public void test1(){
        LinkedList ll = new LinkedList();
        ll.insert(1);       ll.insert(2);
        ll.insert(3);       ll.insert(4);
        ll.insert(5);
        ListNode ln1 = ll.returnListNode();

        int actualInt = printKthToLast(ln1, 4);

        assertEquals(2, actualInt);
    }

    @Test
    public void test2(){
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ListNode ln1 = ll.returnListNode();

        int returnedInt = printKthToLast(ln1, 1);

        assertEquals(1, returnedInt);
    }

    @Test
    public void test3(){
        LinkedList ll = new LinkedList();
        ListNode ln1 = ll.returnListNode();

        int returnedInt = printKthToLast(ln1, 4);

        assertEquals(0, returnedInt);
    }
}