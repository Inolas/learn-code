package com.inolas.tests.dcp;

import com.inolas.solutions.dcp.dcp_205_nextPermutation;
import org.junit.Test;

import static org.junit.Assert.*;

public class dcp_205_nextPermutationTest
{
    dcp_205_nextPermutation np = new dcp_205_nextPermutation();
    @Test
    public void digitToListTest(){
        System.out.println(np.intToList(47895));
    }

    @Test
    public void reverseArrayTest(){
        int[] array = np.reverseArray(np.intToArray(123456789), 2);
        for (int i: array)
        {
            System.out.print(i+",");
        }
    }

    @Test
    public void nextPermutTest1(){

        System.out.println(np.nextPermut(4321));
    }

}