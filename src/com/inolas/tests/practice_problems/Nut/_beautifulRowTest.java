package com.inolas.tests.practice_problems.Nut;

import com.inolas.solutions.practice_problems.Nut._beautifulRow;
import org.junit.Test;

import static org.junit.Assert.*;

public class _beautifulRowTest
{
    _beautifulRow br = new _beautifulRow();
    @Test
    public void test1(){
        int[] row = {3, 17, 4, 12, 5, 6, 2, 1};
        assertEquals(br.beautifulRow(row), 2);
    }
    @Test
    public void test2(){
        int[] row = {3, 17, 4, 12, 5, 6, 7, 2, 1};
        assertEquals(br.beautifulRow(row), 2);
    }
    @Test
    public void test3(){
        int[] row = {1, 2, 100, 99};
        assertEquals(br.beautifulRow(row), 0);
    }
}