package com.inolas.solutions.ctci;
import java.util.HashMap;

public class c1_6_StringCompression
{
    public static String compress(String str)
    {
        int counter = 1;
        StringBuilder outputString = new StringBuilder();
        char prevChar = ' ';
        for (char s : str.toCharArray())
        {
            counter++;
            if(prevChar != s || prevChar != ' '){
                outputString.append(prevChar);
//                if(counter!=1)
                outputString.append(counter);
                counter = 1;
            }
            prevChar = s;
        }
        outputString.append(prevChar);
//        if(counter!=1)
            outputString.append(counter);
        return outputString.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(compress("aabbcc"));
        System.out.println(compress("abc"));
        System.out.println(compress("aaabbacc"));
        System.out.println(compress("aabcccccaaa"));

    }
}
