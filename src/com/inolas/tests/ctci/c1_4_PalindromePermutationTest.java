package com.inolas.tests.ctci;

import com.inolas.solutions.ctci.c1_4_PalindromePermutation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/*
 * Assumptions -
 * TestCases -
 * */
public class c1_4_PalindromePermutationTest
{
    c1_4_PalindromePermutation p = new c1_4_PalindromePermutation();
    List<String> inputsTrue = new ArrayList<String>();

    @Test
    public void assertTrue(){

        inputsTrue.add("taco cat");
        inputsTrue.add("Tact Coa");
        for (String str : inputsTrue)
        {
            boolean expected = p.isPermutOfPalind(str);
            assertSame(expected, true);
        }

    }

    @Test
    public void test1(){
        boolean expected = p.isPermutOfPalind("Tact Coa");
        assertSame(expected, true);
    }

    @Test
    public void test2(){
        boolean expexted = p.isPermutOfPalind("atco eta");
        assertSame(expexted, false);
    }

    @Test
    public void test3(){
        boolean expexted = p.isPermutOfPalind("ino las");
        assertSame(expexted, false);
     }
}