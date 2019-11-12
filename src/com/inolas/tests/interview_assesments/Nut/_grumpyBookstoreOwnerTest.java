package com.inolas.tests.interview_assesments.Nut;

import com.inolas.solutions.interview_assesments.Nut._grumpyBookstoreOwner;
import org.junit.Test;

import static org.junit.Assert.*;

public class _grumpyBookstoreOwnerTest
{
    _grumpyBookstoreOwner gbo = new _grumpyBookstoreOwner();
    @Test
    public void test1(){
        assertEquals(16, gbo.solution(3, new int[]{1, 3, 5, 2, 5, 4}, new int[]{1,1,0,1,0,0}));
    }
    @Test
    public void test2(){
        assertEquals(16, gbo.solution(2, new int[]{5, 2, 1, 2}, new int[]{0, 0, 1, 1}));
    }
    @Test
    public void test3(){
        assertEquals(16, gbo.solution(5, new int[]{1, 3, 5, 2, 5, 4}, new int[]{1, 1, 0, 1, 0, 0}));
    }
}