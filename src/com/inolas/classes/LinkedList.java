package com.inolas.classes;

public class LinkedList{
    public ListNode head;

    public void insert(int data){
        ListNode current = head;
        if(head == null){
            head = new ListNode(data);
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(data);

    }
    public void prepend(int data){

        ListNode newNode = new ListNode(data);
        ListNode current = head;
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void printList()
    {
        ListNode current = head;
        int i = 0;
        while (current != null)
        {
            System.out.print("\nlist item " + i + ": " + current.data);
            i++;
            current = current.next;
        }
    }
    public String stringList()
    {
        String list="";
        ListNode current = head;

        if(current == null)
            list = "";

        while (current.next != null)
        {
            list += current.data+"->";
            current = current.next;
        }
        list += current.data;

        return list;
    }

    public ListNode returnListNode()
    {
        return head;
    }

    public ListNode returnEndNode()
    {
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        return current;
    }
}