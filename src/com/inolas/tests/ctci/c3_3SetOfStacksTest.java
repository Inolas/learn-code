package com.inolas.tests.ctci;
import com.inolas.solutions.ctci.c3_3SetOfStacks;
import org.junit.Test;
import static org.junit.Assert.*;

public class c3_3SetOfStacksTest
{
    @Test
    public void test1(){
        c3_3SetOfStacks pile = new c3_3SetOfStacks();
        pile.push(13);       pile.push(2);
        pile.push(8);       pile.push(0);
        pile.push(3);       pile.push(18);
        pile.push(7);       pile.push(5);
pile.printStack();
//        System.out.println(pile.print());
    }
}