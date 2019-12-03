package com.inolas.classes;

import java.util.Random;

public class LinkedList{
    public ListNode head;
    public LinkedList(){}

    public LinkedList(int[] array){
        for(int i: array){
            this.insert(i);
        }

    }

    //Creates a linked list of length count, with random number ranging 0 to 10.
    public LinkedList(int count){
        Random random = new Random();
        for (int i = 0; i < count; i++)
        {
            int randomNumber = random.nextInt(100);
            this.insert(randomNumber%10);
        }
    }

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
        StringBuilder list = new StringBuilder();
        ListNode current = head;

        if(current == null)
            list.append("");

        while (current.next != null)
        {
            list.append(current.data+"->");
            current = current.next;
        }
        list.append(current.data);

        return list.toString();
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

/*    public LinkedList createRandomList(int count){
        Random random = new Random();
        for (int i = 0; i < count; i++)
        {
            int randomNumber = random.nextInt(10);
            this.insert(randomNumber);
        }
        return this;
    }*/
}