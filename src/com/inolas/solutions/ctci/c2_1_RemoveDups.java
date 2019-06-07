package com.inolas.solutions.ctci;

import com.inolas.classes.LinkedList;
import com.inolas.classes.ListNode;

public class c2_1_RemoveDups
{
    public void removeDups(ListNode head)
    {
        ListNode current = head;
        while (current != null)
        {
            ListNode runner = current.next;
            while (runner.next != null)
            {
                if (current.data == runner.next.data)
                {
                    runner.next = runner.next.next;
                }
                else
                {
                    runner = runner.next;
                }
//                runner = runner.next;
            }
            current = current.next;
        }
//        head.printList();
    }

    public static void main(String[] args)
    {
        LinkedList ll1 = new LinkedList();
        ll1.insert(1);  ll1.insert(3);
        ll1.insert(1);  ll1.insert(4);
        ll1.insert(1);  ll1.insert(9);

//        ll1.printList();
        ListNode ln1 = ll1.returnListNode();

        c2_1_RemoveDups rn = new c2_1_RemoveDups();
        rn.removeDups(ln1);
        ln1.printList();
    }
}
