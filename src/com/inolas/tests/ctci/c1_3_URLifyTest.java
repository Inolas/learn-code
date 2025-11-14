package com.inolas.tests.ctci;
import com.inolas.solutions.ctci.c1_3_URLify;
import org.junit.Test;
import static org.junit.Assert.*;

public class c1_3_URLifyTest
{
    c1_3_URLify U = new c1_3_URLify();
    public void setU(c1_3_URLify u)
    {
//        U = u;
    }
    @Test
    public void test1(){
        String actual = U.urlify("Mr John SMith     ", 13);
        String expected = "Mr%20John%20SMith";

        assertEquals(expected, actual);

    }
}