package com.inolas.tests;

import com.inolas.classes.LinkedList;
import com.inolas.classes.ListNode;
import com.inolas.solutions._206_ReverseLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class _206_ReverseLinkedListTest
{
    _206_ReverseLinkedList reverse = new _206_ReverseLinkedList();
    @Test
    public void test1(){
        LinkedList ll = new LinkedList();
        ll.insert(1);       ll.insert(2);
        ll.insert(3);       ll.insert(4);
        ll.insert(5);
        ListNode ln1 = ll.returnListNode();

        ListNode actualLN = reverse.reverseRecur(ln1);
        String actual = actualLN.toString();
        String expected = "5->4->3->2->1";
        assertEquals(expected ,actual);
    }
    @Test
    public void test2(){

        ListNode ln1 = null;

        ListNode actualLN = reverse.reverseRecur(ln1);
        actualLN.printList();
//        String actual = actualLN.toString();
//        System.out.println(actual+"actual");
        String expected = "";
//        assertEquals(expected ,actual);
    }
    /*Test for iterative function*/
    @Test
    public void test3(){
        LinkedList ll = new LinkedList();
        ll.insert(1);       ll.insert(2);
        ll.insert(3);       ll.insert(4);
        ll.insert(5);
        ListNode ln1 = ll.returnListNode();

        ListNode actualLN = reverse.reverseIterr(ln1);
        String actual = actualLN.toString();
        String expected = "5->4->3->2->1";
        assertEquals(expected ,actual);
    }
}