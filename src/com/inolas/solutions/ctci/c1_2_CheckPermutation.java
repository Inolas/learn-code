package com.inolas.solutions.ctci;
import java.util.Arrays;

/*
* Cons of the code isPermutation(); - creates 2 String objects,
*                                     uses inBuild function Arrays.sort
*
* Alternative - using hashMap to store the count of chars(keys)
*          OR - int[] to store count considering the
* */

public class c1_2_CheckPermutation
{
    public boolean isPermutation(String str1, String str2){
        int flag;
        char[] charStr1 = str1.toLowerCase().toCharArray();
        char[] charStr2 = str2.toLowerCase().toCharArray();

        if(charStr1.length != charStr2.length)
            return false;

        Arrays.sort(charStr1);      Arrays.sort(charStr2);
        String str11 = new String(charStr1);
        String str22 = new String(charStr2);

        if(!str11.equals(str22))
            return false;

        return true;
    }

}
