package com.inolas.tests.leetcode;

import com.inolas.classes.LinkedList;
import com.inolas.classes.ListNode;
import com.inolas.solutions.leetcode._19_RemoveNthNodeFromEndofList;
import org.junit.Test;

public class _19_RemoveNthNodeFromEndofListTest
{
    _19_RemoveNthNodeFromEndofList remove = new _19_RemoveNthNodeFromEndofList();
    @Test
    public void test1(){
        LinkedList ll = new LinkedList();
        ll.insert(1);       ll.insert(2);
        ll.insert(3);       ll.insert(4);
        ll.insert(5);

        ListNode ln = ll.returnListNode();
//        System.out.println(ln.next.data);

        ListNode actual = remove.removeNthFromEnd(ln, 3);
        actual.printList();
    }

    @Test
    public void test2(){
        LinkedList ll = new LinkedList();
        ll.insert(1);

        ListNode ln = ll.returnListNode();

        ListNode actual = remove.removeNthFromEnd(ln, 1);
        actual.printList();
    }

    /* Delete first node*/
    @Test
    public void test3(){
        LinkedList ll = new LinkedList();
        ll.insert(1);       ll.insert(2);
        ll.insert(3);       ll.insert(4);
        ll.insert(5);

        ListNode ln = ll.returnListNode();
//        System.out.println(ln.next.data);

        ListNode actual = remove.removeNthFromEnd(ln, 5);
        actual.printList();
    }

    /* Test case:- Empty list*/
    @Test
    public void test4(){
        LinkedList ll = new LinkedList();
        ListNode ln = ll.returnListNode();

        ListNode actual = remove.removeNthFromEnd(ln, 1);
        actual.printList();
    }

    /* Test case:- Delete the last node*/
    @Test
    public void test5(){
        LinkedList ll = new LinkedList();
        ll.insert(1);       ll.insert(2);
        ll.insert(3);       ll.insert(4);
        ll.insert(5);

        ListNode ln = ll.returnListNode();

        ListNode actual = remove.removeNthFromEnd(ln, 1);
        actual.printList();
    }
}