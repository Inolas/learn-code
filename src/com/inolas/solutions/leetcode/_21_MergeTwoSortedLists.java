// This is not merge // This is LinkedList
package com.inolas.solutions.leetcode;

import com.inolas.classes.LinkedList;
import com.inolas.classes.ListNode;

class MergeTwoSortedLists extends LinkedList
{
    public static ListNode Merge(ListNode<Integer> l1, ListNode<Integer> l2){
        ListNode merged;
        if(l1 == null && l2 == null){
            return null;
        }
        else if(l1 == null || l2 == null){
            //System.out.print(l1 == null? l2.data : l1.data);
            return l1 == null ? l2 : l1;
        }
        if(l1.data < l2.data){
            merged = l1;
            l1 = l1.next;
            //System.out.print("l1:"+l1.data);
        }
        else{
            merged = l2;
            l2 = l2.next;
            //System.out.print("l2"+l2.data);
        }

        merged.next = Merge(l1, l2);
        return merged;
    }
    public static void main(String a[]){
        System.out.print("");
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(3);
        ll.insert(5);

        LinkedList l2 = new LinkedList();
        l2.insert(2);
        l2.insert(4);
        l2.insert(6);

        ListNode ln1 = ll.returnListNode();
        ListNode ln2 = l2.returnListNode();
        ListNode merged;
        merged = Merge(ln1, ln2);
        LinkedList m = new LinkedList();
        merged.printList();

    }
}
