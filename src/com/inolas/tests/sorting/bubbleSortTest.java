package com.inolas.tests.sorting;

import com.inolas.solutions.sorting.bubbleSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class bubbleSortTest
{
    bubbleSort bsA = new bubbleSort();
    @Test
    public void arrayTest1(){
        int[] array = {2, 4, 5, 1, 3};

        int[] actualArray = bsA.bubbleSort(array);
        int[] expectedArray = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedArray, actualArray);
    }
    @Test
    public void arrayTest2(){
        int[] array = {2};

        int[] actualArray = bsA.bubbleSort(array);
        int[] expectedArray = {2};
        assertArrayEquals(expectedArray, actualArray);
    }

}