package com.inolas.classes;

public class Queue
{
    public ListNode head;
    public ListNode tail;

    public ListNode insert(int i)
    {
        ListNode current = head;
        if (head == null)
        {
            head = new ListNode(i);
            head.next = null;
            tail = head;
        }
        else
        {
            while(current.next != null)
            {
                current = current.next;
            }
            current = new ListNode(i);
            tail = current;
        }
        return head;
    }
}
