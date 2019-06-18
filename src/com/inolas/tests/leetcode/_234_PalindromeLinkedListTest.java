package com.inolas.tests.leetcode;

import com.inolas.classes.LinkedList;
import com.inolas.classes.ListNode;
import com.inolas.solutions.leetcode._234_PalindromeLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class _234_PalindromeLinkedListTest
{
    _234_PalindromeLinkedList pp = new _234_PalindromeLinkedList();
    @Test
    public void test()
    {
        LinkedList ll = new LinkedList();
        ll.insert(1);        ll.insert(2);
        ll.insert(3);        ll.insert(3);
        ll.insert(1);        ll.insert(3);

        ListNode ln = ll.returnListNode();
        assertSame(false, pp.isListPalindrome(ln));
    }

    @Test
    public void test2()
    {
        LinkedList ll = new LinkedList();
        ll.insert(1);        ll.insert(2);
        ll.insert(2);        ll.insert(1);

        ListNode ln = ll.returnListNode();
        assertSame(true, pp.isListPalindrome(ln));
    }

    @Test
    public void test3()
    {
        LinkedList ll = new LinkedList();
        ll.insert(1);

        ListNode ln = ll.returnListNode();
        assertSame(true, pp.isListPalindrome(ln));
    }
}