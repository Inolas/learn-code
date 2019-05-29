package com.inolas.solutions.sorting;

import com.inolas.classes.ListNode;

public class bubbleSort
{
    public int[] bubbleSort(int[] array){
        int[] sortedArray = {};

        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

        sortedArray = array;
        return sortedArray;
    }

    ListNode bubbleSort(ListNode head){
        ListNode sortedLN = new ListNode(0);
        sortedLN.next = head;

        /*https://www.geeksforgeeks.org/bubble-sort-for-linked-list-by-swapping-nodes/*/

        return sortedLN.next;
    }
}
