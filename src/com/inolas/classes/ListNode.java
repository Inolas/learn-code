package com.inolas.classes;

public class ListNode<T>{
    public T data;
    public ListNode<T> next;
    public ListNode(T data){
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
        StringBuilder list = new StringBuilder();
        ListNode current = this;

        if(current == null)
            return list.append("").toString();

        while (current.next != null)
        {
            list.append(current.data+"->");
            current = current.next;
        }
        list.append(current.data);

        return list.toString();
    }
}
