package com.inolas.solutions;

import com.inolas.classes.ListNode;

public class c2_2_ReturnKthToLast
{
    public static int printKthToLast(ListNode head, int value){
        int KthPos, listLength = 0;
        ListNode current = head;

        if(head == null)
            return 0;

        while(current != null){
            listLength++;
            current = current.next;
        }

        KthPos = listLength - value;
        for (int i = 0; i < KthPos; i++)
        {
            head = head.next;
        }
        return head.data;
    }

    public static void main(String[] args)
    {

    }
}
