package com.inolas.solutions.ctci;

public class c1_5_OneAway
{
    public static boolean oneAway(String s1, String s2)
    {
        int s1_len = s1.length(), s2_len = s2.length();
        if(s2_len > s1_len)
        {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        int charDiff = 0;
        //Replace edit
        if(s1_len == s2_len)
        {
            for (int i=0; i<s1_len; i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))charDiff++;
                if(charDiff>1) return false;
            }
        } else if (Math.abs(s1_len - s2_len) == 1)  //Insert or Remove edit
        {
            int i =0, j=0;
            while(i<s1_len && j<s2_len)
            {
                if(s1.charAt(i) == s2.charAt(j))
                {
                    i++; j++;
                }
                else
                {
                    i++;
                    charDiff++;
                }
            }
        }
        else
            return false;

        return charDiff==1? true : false;

        /*
        * 3 possible edits - insert, remove and replace
        * insert and remove =
        * replace
        * */
    }
}
