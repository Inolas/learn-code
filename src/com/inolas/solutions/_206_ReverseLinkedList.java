package com.inolas.solutions;

import com.inolas.classes.ListNode;

public class _206_ReverseLinkedList
{
    public static ListNode reverseRecur(ListNode head){
//        ListNode newHead = new ListNode(0);
         if(head == null || head.next == null)
             return head;
        ListNode prev = reverseRecur(head.next);
        head.next.next = head;
        head.next = null;

        return prev;
    }
    public static ListNode reverseIterr(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        ListNode tempCurr;
        while (current != null)
        {
            tempCurr = current.next;
            current.next = prev;
            prev = current;
            current = tempCurr;
        }
        return prev;
    }
}
