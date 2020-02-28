package com.inolas.tests.dcp;

import com.inolas.solutions.dcp._1111_first_non_repeating;
import org.junit.Test;

import static org.junit.Assert.*;

public class _1111_first_non_repeatingTest
{
    _1111_first_non_repeating fnr = new _1111_first_non_repeating();
    @Test
    public void test1(){
        String input = "zzzbbbvvvddehhhhii";
        char expected = 'e';
        assertEquals(expected, fnr.firstNonRepeating(input));
    }
    @Test
    public void test_(){
        String input = "abcabc";
        assertEquals('-', fnr.firstNonRepeating(input));
    }
    @Test
    public void test_blackInput(){
        String input = "";
        assertEquals('-', fnr.firstNonRepeating(input));
    }
}