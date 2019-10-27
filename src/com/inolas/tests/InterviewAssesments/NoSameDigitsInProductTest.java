package com.inolas.tests.InterviewAssesments;

import com.inolas.solutions.InterviewAssesments.NoSameDigitsInProduct;
import org.junit.Test;

import static org.junit.Assert.*;

public class NoSameDigitsInProductTest
{
    NoSameDigitsInProduct nsdip = new NoSameDigitsInProduct();
    @Test
    public void test1(){
        int expected = 1;
        int actual = nsdip.count(10,12,2);
        assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int expected = 9;
        int actual = nsdip.count(5,15,2);
        assertEquals(expected, actual);
    }
}