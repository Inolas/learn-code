package com.inolas.tests.sorting;

import com.inolas.solutions.sorting.mergeSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class mergeSortTest
{
    @Test
    public void test1(){

        mergeSort m = new mergeSort();
        int actualArray[] = {12, 11, 13, 5, 6, 7};
        m.sort(actualArray, 0, actualArray.length-1);

        int expectedArray[] = {5, 6, 7, 11, 12, 13};

        assertArrayEquals(expectedArray, actualArray);
    }
}