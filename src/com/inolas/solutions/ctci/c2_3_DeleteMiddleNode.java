package com.inolas.solutions.ctci;
import com.inolas.classes.LinkedList;
import com.inolas.classes.ListNode;

public class c2_3_DeleteMiddleNode
{
    public static void deleteNode(ListNode node){
        if (node.next == null){
            return;
        }
        else{
            node.data = node.next.data;
            node.next = node.next.next;
        }

    }

    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.insert(1);       ll.insert(2);
        ll.insert(3);       ll.insert(4);
        ll.insert(5);

        ListNode ln1 = ll.returnListNode();

        deleteNode(ln1.next.next.next);

        ln1.printList();

    }
}
