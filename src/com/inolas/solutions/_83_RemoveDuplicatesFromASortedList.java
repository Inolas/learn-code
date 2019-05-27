package com.inolas.solutions;

import com.inolas.classes.LinkedList;
import com.inolas.classes.ListNode;

class RemoveDuplicatesFromSortedList extends LinkedList
{
    public static ListNode deleteDuplicates(ListNode head){
        if(head == null || head.next == null)
            return head;
        head.next = deleteDuplicates(head.next);
        if(head.data == head.next.data)
            return head.next;
        else return head;
    }
    public static void main(String a[]){
        System.out.print("");
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(1);
        ll.insert(1);


        ListNode ln1 = ll.returnListNode();
        ListNode ln2;

        ln2 = deleteDuplicates(ln1);
        ln2.printList();

    }
}
