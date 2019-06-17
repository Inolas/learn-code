package com.inolas.solutions;
import com.inolas.classes.ListNode;

public class _19_RemoveNthNodeFromEndofList
{
    public static ListNode removeNthFromEnd(ListNode head, int n){
        int listLength = head.lengthList();
        int Nth = listLength - n;

        if(listLength == 1)
            return null;

        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode current = newHead;
        for (int i=0; i < Nth ; i++){
            current = current.next;
        }

        current.next = current.next.next==null? null: current.next.next;

        return newHead.next;
    }
}
