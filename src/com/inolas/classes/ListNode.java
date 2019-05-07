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
}
