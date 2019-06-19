package com.inolas.tests.leetcode;

import com.inolas.solutions.leetcode._13_RomanToInteger;
import org.junit.Test;

import static org.junit.Assert.*;

public class _13_RomanToIntegerTest
{
    _13_RomanToInteger ri = new _13_RomanToInteger();
    @Test
    public void test1(){
        assertEquals(3, ri.romanToInt("III"));
    }
    @Test
    public void test2(){
        assertEquals(4, ri.romanToInt("IV"));
    }
    @Test
    public void test3(){
        assertEquals(1994, ri.romanToInt("MCMXCIV"));
    }
    @Test
    public void test4(){
        assertEquals(58, ri.romanToInt("LVIII"));
    }
    @Test
    public void test5(){
        assertEquals(9, ri.romanToInt("IX"));
    }
}