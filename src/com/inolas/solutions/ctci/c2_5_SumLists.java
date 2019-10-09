package com.inolas.solutions.ctci;

import com.inolas.classes.ListNode;

public class c2_5_SumLists
{
    public static ListNode<Integer> sumLists(ListNode<Integer> l1, ListNode<Integer> l2){
        ListNode sumList = new ListNode(0);
        ListNode sum = sumList;
        int carry = 0;
        while(l1 != null || l2 != null){
            int addtion = (l1==null ? 0 : l1.data) + (l2 == null ? 0 : l2.data);
            int sumData = addtion % 10 + carry;
            sumList.next = new ListNode(sumData);
            carry = addtion / 10;

            if(l1 != null)  l1 = l1.next;
            if(l2 != null)  l2 = l2.next;

            sumList = sumList.next;
        }
        while(l1 != null){
            sumList.next = new ListNode(l1.data + carry);
            l1 = l1.next;
            sumList = sumList.next;
        }
        while(l2 != null){
            sumList.next = new ListNode(l2.data + carry);
            l2 = l2.next;
            sumList = sumList.next;
        }
        if(carry > 0){
            sumList.next = new ListNode(carry);
        }

        return sum.next;
    }
}
