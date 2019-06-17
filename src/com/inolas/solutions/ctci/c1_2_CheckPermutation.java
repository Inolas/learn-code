package com.inolas.solutions.ctci;

import java.util.HashMap;

public class c1_2_CheckPermutation
{
    public static boolean isPermutation(String str1, String str2){
        HashMap<Character, Integer> hmStr = new HashMap<>();
        for(char s: str1.toCharArray()){
            if(hmStr.containsKey(s))
            {
                int val = hmStr.get(s);
                hmStr.replace(s, val++);
            }
            else
                hmStr.put(s, 1);
        }

        for(char s: str2.toCharArray()){
            if (hmStr.containsKey(s))
            {
                int val = hmStr.get(s);
                hmStr.replace(s, val--);
            }

        }
        return true;
    }
}
