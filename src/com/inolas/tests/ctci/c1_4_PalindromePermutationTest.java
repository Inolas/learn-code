package com.inolas.tests.ctci;

import com.inolas.solutions.ctci.c1_4_PalindromePermutation;
import org.junit.Test;

import static org.junit.Assert.*;

public class c1_4_PalindromePermutationTest
{
    c1_4_PalindromePermutation p = new c1_4_PalindromePermutation();

    @Test
    public void test1(){
        boolean expectedOutput = p.isPermutOfPalind("Tact Coa");
        assertSame(expectedOutput, true);
    }

    @Test
    public void test2(){
        boolean expextedOutput = p.isPermutOfPalind("atco eta");
    }
}