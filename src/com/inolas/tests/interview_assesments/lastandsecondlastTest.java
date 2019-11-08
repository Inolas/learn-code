package com.inolas.tests.interview_assesments;

import com.inolas.solutions.interview_assesments.lastandsecondlast;
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