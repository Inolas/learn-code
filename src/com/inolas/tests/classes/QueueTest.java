package com.inolas.tests.classes;

import com.inolas.classes.Queue;
import org.junit.Test;

public class QueueTest
{
    @Test
    public void enqueueTest(){
        Queue qu = new Queue();
        qu.enqueue(1);
        qu.enqueue(2);
    }
}
