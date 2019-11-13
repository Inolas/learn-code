package com.inolas.tests.practice_problems;

import com.inolas.solutions.practice_problems.$CutCommonality;
import org.junit.Test;

import static org.junit.Assert.*;

public class CutCommonalityTest
{
    $CutCommonality mcc = new $CutCommonality();

    @Test
    public void test1(){
        int expected = 3;
        int actual = mcc.max_cut_commonality("abcdedeara");
        assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int expected = 3;
        int actual = mcc.max_cut_commonality("abcdecdefg");
        assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        int expected = 4;
        int actual = mcc.max_cut_commonality("zzzxxxzzz");
        assertEquals(expected, actual);
    }
    @Test
    public void test_chararray(){
        int expected = 3;
        int actual = mcc.chararray_cut("abcdedeara");
        assertEquals(expected, actual);
    }
}