package com.inolas.tests.practice_problems.Nut;

import com.inolas.solutions.practice_problems.xtn.__0_pizzaTreats;
import org.junit.Test;

import static org.junit.Assert.*;

public class _pizzaTreatsTest
{
    __0_pizzaTreats pt = new __0_pizzaTreats();
    @Test
    public void test1(){
        int[] visitors = new int[]{1,2,1,2};
        assertEquals("YES", pt.pizzaTreats(visitors));
    }
    @Test
    public void test2(){
        int[] visitors = new int[]{1,2,2};
        assertEquals("NO", pt.pizzaTreats(visitors));
    }
    @Test
    public void test3(){
        int[] visitors = new int[]{1, 0, 2};
        assertEquals("NO", pt.pizzaTreats(visitors));
    }
}