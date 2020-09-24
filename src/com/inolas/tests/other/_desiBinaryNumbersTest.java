package com.inolas.tests.other;

import com.inolas.solutions.other._desiBinaryNumbers;
import org.junit.Test;

public class _desiBinaryNumbersTest
{
    _desiBinaryNumbers dbn = new _desiBinaryNumbers();
    @Test
    public void test1(){
        dbn.solve(5);
    }
    @Test
    public void test2(){
        dbn.solve(21);
    }
    @Test
    public void test3(){
        dbn.solve(102);
    }
    @Test
    public void test4(){
        dbn.solve(121);
    }

}