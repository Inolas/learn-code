package com.inolas.tests.classes;

import com.inolas.classes.Queue;
import org.junit.Test;

public class QueueTest
{
    Queue qu = new Queue();
    @Test
    public void enqueueTest(){
        qu.enqueue(1);
        qu.enqueue(2);
        qu.enqueue(3);
        qu.enqueue(4);
        qu.enqueue(5);
        System.out.println(qu.printQ());
        System.out.println(qu.length());
    }

    @Test
    public void printQTest(){
        System.out.println(qu.printQ());
    }

    @Test
    public void lengthTest(){

    }
}
