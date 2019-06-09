package com.inolas.tests.ctci;

import com.inolas.solutions.ctci.c1_5_OneAway;
import org.junit.Test;
import static org.junit.Assert.*;

public class c1_5_OneAwayTest
{
    c1_5_OneAway oA = new c1_5_OneAway();
    @Test
    public void test1(){
        boolean expected = oA.oneAway("pale", "ple");
        assertSame(expected, true);
    }
    @Test
    public void test2(){
        boolean expected = oA.oneAway("pales", "pale");
        assertSame(expected, true);
    }
    @Test
    public void test3(){
        boolean expected = oA.oneAway("pale", "bale");
        assertSame(expected, true);
    }
    @Test
    public void test4(){
        boolean expected = oA.oneAway("pale", "bake");
        assertSame(expected, false);
    }
    @Test
    public void test5(){
        boolean expected = oA.oneAway("pale", "pe");
        assertSame(expected, false);
    }
}