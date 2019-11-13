package com.inolas.tests.practice_problems;

import com.inolas.solutions.practice_problems.lastandsecondlast;
import org.junit.Test;

import static org.junit.Assert.*;

public class lastandsecondlastTest
{
    lastandsecondlast lasl = new lastandsecondlast();

    @Test
    public void test1(){
        assertEquals("E L", lasl.lastLetters("APPLE"));
    }

    @Test
    public void test2(){
        assertEquals("t a", lasl.lastLetters("bat"));
    }

    @Test
    public void test3(){
        assertEquals("",lasl.lastLetters(""));
    }

}