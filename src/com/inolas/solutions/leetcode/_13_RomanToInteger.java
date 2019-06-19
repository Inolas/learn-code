package com.inolas.solutions.leetcode;

import java.util.HashMap;

public class _13_RomanToInteger
{
    public int romanToInt(String s) {

        HashMap<Character, Integer> hmRoman = new HashMap<Character, Integer>();
        hmRoman.put('I', 1);
        hmRoman.put('V',5);
        hmRoman.put('X',10);
        hmRoman.put('L',50);
        hmRoman.put('C',100);
        hmRoman.put('D',500);
        hmRoman.put('M',1000);
        int sum = 0;
        char[] inp = s.toCharArray();

        for(int i=inp.length; i>0; i--){
            if(sum < hmRoman.get(s.charAt(i-1)) || s.charAt(i-1) == s.charAt(i))
                sum += hmRoman.get(s.charAt(i-1));
            else
                sum -= hmRoman.get(s.charAt(i-1));
        }
        return sum;
    }
}
