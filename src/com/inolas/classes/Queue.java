package com.inolas.classes;

public class Queue
{
    public ListNode head;
    public ListNode tail;

    public void enqueue(int i)
    {
        ListNode current = head;
        if (head == null)
        {
            head = new ListNode(i);
            tail = head;
            return;
        }

        tail.next = new ListNode(i);
        tail = tail.next;
    }
    /*
    * Delete a node form the tail.
    * */
    public void dequeue(){
        if(head == null)
        {
            return;
        }
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
    }

    public String printQ(){
        String sQ = "";
        ListNode current = head;
        if(head == null)
            return null;
        while (current.next.next != null)
        {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print(current.data);
        return sQ;
    }

}
