package com.inolas.tests.practice_problems.Qr;

import com.inolas.solutions.practice_problems.Qr._removeOneDigit;
import org.junit.Test;

import static org.junit.Assert.*;

public class _removeOneDigitTest
{
    _removeOneDigit rod = new _removeOneDigit();
    @Test
    public void test1(){
        String s = "ab12c";
        String t = "1zz456";

//        assertEquals(1, rod.removeOneDigit(s, t));
        System.out.println(rod.removeOneDigit(s, t));
//        System.out.println(rod.getFirstInt(s));
    }

}