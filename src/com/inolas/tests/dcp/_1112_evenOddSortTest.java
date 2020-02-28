package com.inolas.tests.dcp;

import com.inolas.solutions.dcp._1112_evenOddSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class _1112_evenOddSortTest
{
    _1112_evenOddSort eos = new _1112_evenOddSort();
    @Test
    public void test1(){
        int[] output = eos.evenOddSort(new int[]{2,3,7,8,6,4,5});
        for (int i :
                output)
        {
            System.out.println(i);
        }
        System.out.println();
    }

}