package com.inolas.tests.ctci;

import com.inolas.classes.LinkedList;
import com.inolas.classes.ListNode;
import com.inolas.solutions.ctci.c2_5_SumLists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class c2_5_SumListsTest
{
    c2_5_SumLists sumlist = new c2_5_SumLists();
    @Test
    public void test1(){
        LinkedList ll1 = new LinkedList();
        ll1.insert(7);  ll1.insert(1);
        ll1.insert(6);

        LinkedList ll2 = new LinkedList();
        ll2.insert(5);  ll2.insert(9);
        ll2.insert(2);

        LinkedList llExpected = new LinkedList();
        llExpected.insert(2);  llExpected.insert(1);
        llExpected.insert(9);

        ListNode llActual = sumlist.sumLists(ll1.returnListNode(), ll2.returnListNode());

        assertEquals(llExpected.stringList(), llActual.toString());
    }

    @Test
    public void test2(){
        LinkedList ll1 = new LinkedList(new int[]{1, 2, 3});
        LinkedList ll2 = new LinkedList(new int[]{3, 1, 8});
        LinkedList llExpected = new LinkedList(new int[]{4, 3, 1, 1});
        ListNode llActual = sumlist.sumLists(ll1.head, ll2.head);

        assertEquals(llExpected.stringList(), llActual.toString());
    }
}
