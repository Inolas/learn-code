package com.inolas.tests.interview_assesments;

import com.inolas.solutions.interview_assesments._BeautifulRow;
import org.junit.Test;

import static org.junit.Assert.*;

public class _BeautifulRowTest
{
    _BeautifulRow br = new _BeautifulRow();
    @Test
    public void test1(){
        int[] row = {3, 17, 4, 12, 5, 6, 2, 1};
        System.out.println(br.beautifulRow(row));
    }
    @Test
    public void test2(){
        int[] row = {3, 17, 4, 12, 5, 6, 7, 2, 1};
        System.out.println(br.beautifulRow(row));
    }
    @Test
    public void test3(){
        int[] row = {1, 2, 100, 99};
        System.out.println(br.beautifulRow(row));
    }
}