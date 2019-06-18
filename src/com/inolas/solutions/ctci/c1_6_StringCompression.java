package com.inolas.solutions.ctci;

import java.util.HashMap;

public class c1_6_StringCompression
{
    public String compress(String str)
    {
        char prev = ' ';
        for (char s :
                str.toCharArray())
        {
            if(prev == s){

            }

            prev = s;

        }
        return str;
    }
}
