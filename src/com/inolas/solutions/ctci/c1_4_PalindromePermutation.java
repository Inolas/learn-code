package com.inolas.solutions.ctci;

import java.util.HashMap;
/*
*
* */
public class c1_4_PalindromePermutation
{
    public boolean isPermutOfPalind(String inputString)
    {
        int oddCount = 0;
        String input = inputString.replaceAll("[@$#%:;.,]", "");
        char[] inputArray = input.toCharArray();
        HashMap<Character, Integer> wordCount = new HashMap<Character, Integer>();
        for (char i: inputArray)
        {
            i = Character.toLowerCase(i);
            if (i != ' ')
            {
                if (wordCount.containsKey(i))
                {
                    int charCount = wordCount.get(i);
                    wordCount.replace(i, ++charCount);
                } else
                {
                    wordCount.put(i, 1);
                }
            }
        }

        for (char i : wordCount.keySet())
        {
            int iValue = wordCount.get(i);
            if (iValue % 2 != 0)
            {
                oddCount++;
            }
        }
        return oddCount > 1 ? false : true;
    }
}
