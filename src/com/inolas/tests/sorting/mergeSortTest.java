package com.inolas.tests.sorting;

import com.inolas.classes.LinkedList;
import com.inolas.classes.ListNode;
import com.inolas.solutions.sorting.mergeSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class mergeSortTest
{
    @Test
    public void test1(){

        mergeSort m = new mergeSort();
        int actualArray[] = {5, 10, 3,18, 1, 6, 20};
        m.mergeSort(actualArray, 0, actualArray.length-1);

        int expectedArray[] = {1, 3, 5, 6, 10, 18, 20};
        System.out.println(m.printArray(actualArray));
        assertArrayEquals(expectedArray, actualArray);
    }
    @Test
    // Linked List Merge Sort
    public void test2(){
        LinkedList ll = new LinkedList();
        ll.insert(5);       ll.insert(10);
        ll.insert(3);        ll.insert(18);
        ll.insert(1);        ll.insert(6);
        ll.insert(20);

        mergeSort merge = new mergeSort();
        ListNode ln = ll.returnListNode();

        ListNode actualOutput = merge.mergeSort(ln);
        actualOutput.printList();
        System.out.println();
        LinkedList l2 = new LinkedList();
        ll.insert(5);       ll.insert(10);
        ll.insert(3);        ll.insert(18);
        ll.insert(1);        ll.insert(6);
        ll.insert(20);

    }
}