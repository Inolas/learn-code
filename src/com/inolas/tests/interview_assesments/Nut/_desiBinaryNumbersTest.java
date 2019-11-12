package com.inolas.tests.interview_assesments.Nut;

import com.inolas.solutions.interview_assesments.Nut._desiBinaryNumbers;
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

}