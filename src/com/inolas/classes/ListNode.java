package com.inolas.classes;

public class ListNode{
    public int data;
    public ListNode next;
    public ListNode(int data){
        this.data = data;
    }

    public void printList(){
        ListNode current = this;
        int i=0;
        while(current != null){
            System.out.print("\nlist item "+i+": "+ current.data);
            i++;
            current = current.next;
        }
    }
    public int lengthList(){
        ListNode current = this;
        int length = 0;
        while(current != null){
            length++;
            current = current.next;
        }
        return length;
    }
    @Override
    public String toString(){
        String list="";
        ListNode current = this;

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
}
