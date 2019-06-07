package com.inolas.tests.ctci;

import com.inolas.solutions.ctci.c1_1_IsUnique;
import org.junit.Test;

import static org.junit.Assert.*;

public class c1_1_IsUniqueTest
{
    c1_1_IsUnique uniqueStr = new c1_1_IsUnique();
    @Test
    public void test1()
    {
        assertSame(true, uniqueStr.unique("Pyraminx"));
    }
    @Test
    public void test2()
    {
        assertSame(false, uniqueStr.unique("Megaminx"));
    }
}