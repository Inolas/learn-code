package com.inolas.solutions.sorting;

import com.inolas.classes.ListNode;

import java.util.List;

public class mergeSort
{
    public void mergeSort(int[] array, int left, int right)
    {

        int mid = (left + right) / 2;

        if (left < right)
        {
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);

        }
    }

    public void merge(int[] array, int left, int mid, int right)
    {

        int nL = mid - left + 1;    //number of elements in leftArray
        int[] leftArray = new int[nL];
        for (int i = 0; i < nL; i++)
        {
            leftArray[i] = array[left + i];
        }

        int nR = right - mid;    //number of elements in rightArray
        int[] rightArray = new int[nR];
        for (int i = 0; i < right - mid; i++)
        {
            rightArray[i] = array[mid + 1 + i];
        }
        int i = 0, j = 0;
        int k = left;

        //comparing elements in 2 halves in order
        while (i < nL && j < nR)
        {
            if (leftArray[i] < rightArray[j])
            {
                array[k] = leftArray[i];
                i++;
            } else
            {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        //adding remaining elements in the array. since sorted no need to compare.
        while (i < nL)
        {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < nR)
        {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public String printArray(int[] array)
    {
        String strArray = "";
        int n = array.length;
        for (int i = 0; i < n; ++i)
            strArray += array[i] + " ";
        return strArray;
    }

    public ListNode mergeSort(ListNode head)
    {
        if(head == null || head.next == null){
            return head;
        }
        ListNode sortedList = new ListNode(0);
        ListNode end = head, mid = head, left = head;

        if(end != null || end.next != null)
        {
            mid = head;
            left = head;
            end = head.next.next;
        }
        while (end != null)
        {
            mid = mid.next;
            left.next = head.next;
            end = end.next.next;
        }
        left.next = null;

        /*********************************/
        ListNode list1 = mergeSort(left);
        ListNode list2 = mergeSort(mid);
        /********************************/

        sortedList = merge(list1, list2);

        return sortedList.next;
    }

    public ListNode merge(ListNode l1, ListNode l2)
    {
        ListNode merge = new ListNode(0);

        if(l1 == null || l2 == null){
            return null;
        }
        while(l1!= null || l2!= null){
            if(l1.data < l2.data){
                merge.next = l1.next;
                l1 = l1.next;
            }
            else{
                merge.next = l2.next;
                l2 = l2.next;
            }
            merge = merge.next;
        }
        while(l1 != null){
            merge.next = l1.next;
            l1 = l1.next;
        }
        while(l2 != null){
            merge.next = l2.next;
            l2 = l2.next;
        }
        return merge.next;
    }
}
