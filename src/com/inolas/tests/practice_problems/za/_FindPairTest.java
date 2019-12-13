package com.inolas.tests.practice_problems.za;

import com.inolas.solutions.practice_problems.za._FindPair;
import org.junit.Test;

import static org.junit.Assert.*;

public class _FindPairTest
{
    _FindPair fp = new _FindPair();
    int[][] input = {{1,5,9,13},{2,6,10,14},{3,7,11,15},{4,8,12,16}};
    @Test
    public void test1(){

        assertEquals(fp.find(input, 14).toString(), "1, 3");
    }
    @Test
    public void test2(){

        assertEquals(fp.find(input, 24).toString(), "-1, -1");
    }

}