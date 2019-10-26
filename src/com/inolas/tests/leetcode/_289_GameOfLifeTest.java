package com.inolas.tests.leetcode;

import com.inolas.solutions.leetcode._289_GameOfLife;
import org.junit.Test;

import static org.junit.Assert.*;

public class _289_GameOfLifeTest
{
    _289_GameOfLife gol = new _289_GameOfLife();

    @Test
    public void test1(){
        int[][] input = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        int[][] expected = {{0,0,0},{1,0,1},{0,1,1},{0,1,0}};
        assertArrayEquals(gol.gameOfLife(input), expected);
    }
}