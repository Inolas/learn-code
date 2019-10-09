package com.inolas.classes;

import java.util.List;

public class Queue<T>
{
    public ListNode<T> front; //head
    public ListNode<T> back; //tail

    /*
    * Enqueue from back
    * */
    public void enqueue(T i)
    {
        if (front == null)
        {
            front = new ListNode(i);
            back = front;
            return;
        }
        back.next = new ListNode(i);
        back = back.next;
    }
    /*
    * Delete a node form the front.
    * */
    public T dequeue(){
        T frontValue;
        if(front == null)
        {
            back = null;
            return null;
        }
        frontValue = front.data;
        front = front.next;

        return frontValue;
    }

    public boolean isEmpty(){
        if(front == null)
            return true;
        return false;
    }

    public int length(){
        int len = 1;
        ListNode current = front;
        if(current == null)
            return 0;
        while (current.next != null){
            current = current.next;
            len++;
        }
        return len;
    }

    /*
    *   Test verified
    * */
    public String printQ(){
        String sQ = "";
        ListNode current = front;
        if(front == null)
            return null;
        while (current.next != null)
        {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print(current.data);
        return sQ;
    }

}
