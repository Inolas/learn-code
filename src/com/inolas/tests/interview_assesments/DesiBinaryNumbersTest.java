package com.inolas.tests.interview_assesments;

import com.inolas.solutions.interview_assesments.DesiBinaryNumbers;
import org.junit.Test;

import static org.junit.Assert.*;

public class DesiBinaryNumbersTest
{
    DesiBinaryNumbers dbn = new DesiBinaryNumbers();
    @Test
    public void test1(){
        dbn.solve(5);
    }
    @Test
    public void test2(){
        dbn.solve(21);
    }
    @Test
    public void test3(){
        dbn.solve(102);
    }

}