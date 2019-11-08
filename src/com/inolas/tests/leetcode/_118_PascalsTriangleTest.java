package com.inolas.tests.leetcode;

import com.inolas.solutions.leetcode._118_PascalsTriangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class _118_PascalsTriangleTest
{
    _118_PascalsTriangle pt = new _118_PascalsTriangle();

    @Test
    public void test1(){
        System.out.println(pt.triangle(3));
        System.out.println(pt.triangle(5));
        System.out.println(pt.triangle(15));
    }

}