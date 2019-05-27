package com.inolas.tests;

import com.inolas.classes.*;
import com.inolas.solutions.c2_1_RemoveDups;
import org.junit.Test;

import static org.junit.Assert.*;

public class c2_1_RemoveDupsTest
{
    @Test
    public void test1(){
        LinkedList ll1 = new LinkedList();
        ll1.insert(1);  ll1.insert(3);
        ll1.insert(2);  ll1.insert(4);
        ll1.insert(1);  ll1.insert(2);

        ListNode ln1 = ll1.returnListNode();
        c2_1_RemoveDups rn = new c2_1_RemoveDups();
        rn.removeDups(ln1);
    }
}