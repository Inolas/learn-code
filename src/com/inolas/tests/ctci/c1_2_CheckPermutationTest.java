package com.inolas.tests.ctci;

import com.inolas.solutions.ctci.c1_2_CheckPermutation;
import org.junit.Test;
import static org.junit.Assert.*;

public class c1_2_CheckPermutationTest
{
    c1_2_CheckPermutation cp = new c1_2_CheckPermutation();
    @Test
    public void test1(){
        boolean actual = cp.isPermutation("Saloni", "INolas");
        assertSame(true, actual);
    }
    @Test
    public void test2(){
        boolean actual = cp.isPermutation("Saloni", "Nolas");
        assertSame(false, actual);
    }
    @Test
    public void test3(){
        boolean actual = cp.isPermutation("Kanak", "Kanika");
        assertSame(false, actual);
    }
    @Test
    public void test4(){
        boolean actual = cp.isPermutation("Kanak", "Kanak");
        assertSame(true, actual);
    }
}