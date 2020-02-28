package com.inolas.solutions.dcp;

import java.util.HashMap;
public class _1111_first_non_repeating
{
    public char firstNonRepeating(String input){

        HashMap<Character, Integer> repeatingChars = new HashMap<>();
        for (char ch :
                input.toCharArray())
        {
            if(repeatingChars.containsKey(ch)){
                repeatingChars.replace(ch, repeatingChars.get(ch)+1);
            }else{
                repeatingChars.put(ch, 1);
            }
        }
        for (char ch :
                input.toCharArray())
        {
            if(repeatingChars.get(ch) == 1){
                return ch;
            }
        }
        return '-';
    }
}
