package com.inolas.solutions.leetcode;

import com.inolas.classes.LinkedList;
import com.inolas.classes.ListNode;
import com.inolas.solutions._206_ReverseLinkedList;

public class _234_PalindromeLinkedList
{
    _206_ReverseLinkedList rev = new _206_ReverseLinkedList();
    public boolean isListPalindrome(ListNode head){
        //
        ListNode slow = head;
        ListNode fast = head;

        /*
        * using && as the code will give an null pointer
        * exception if checked for || condition
        * */
        while (fast != null && fast.next != null)
        {
            slow = slow.next;     fast = fast.next.next;
        }
        slow = rev.reverseIterr(slow);
        slow.printList();

        fast = head;

        while (slow != null)
        {
            if(fast.data != slow.data){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

}
