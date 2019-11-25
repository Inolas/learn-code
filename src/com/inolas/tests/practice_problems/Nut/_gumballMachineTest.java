package com.inolas.tests.practice_problems.Nut;

import com.inolas.solutions.practice_problems.xtn._gumballMachine;
import org.junit.Test;

import static org.junit.Assert.*;

public class _gumballMachineTest
{
    _gumballMachine gm = new _gumballMachine();
    String[] dailyDeliveries;
    float delta = 0.000000001f;
    @Test
    public void test1(){
        dailyDeliveries = new String[]{"red", "greeen", "blue", "red", "white"};
        assertEquals(9.7f, gm.minimumWastageCost(dailyDeliveries), delta);
    }
    @Test
    public void test2(){
        dailyDeliveries = new String[]{"red", "red"};
        assertEquals(0.0f, gm.minimumWastageCost(dailyDeliveries), delta);
    }
}