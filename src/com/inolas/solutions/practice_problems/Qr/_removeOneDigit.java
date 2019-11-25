package com.inolas.solutions.practice_problems.Qr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//s lexicographically smaller than t.
//Approach: Collect all the digits in an array, remove each digit one by one
public class _removeOneDigit
{
    public int removeOneDigit(String s, String t){
        int sFirstDigit = getFirstInt(s);
        int tFirstDigit = getFirstInt(t);

        String[] sArray = s.split("");
        List<String> sArrayList = Arrays.asList(sArray);
        List<String> sDigits = new ArrayList<>();
        sDigits = sArrayList.stream()
//                .filter(p -> p.equals("[a-z]"))
                .collect(Collectors.toList());

        sDigits.forEach(s2 -> System.out.println(s2.getClass()));
        String[] fDigits = t.split("[0-9]*");

        int count = 0;
        if (sFirstDigit < tFirstDigit)
            count++;

        return count;
    }
    public int getFirstInt(String str){
        int digit;
        String[] digitsInStr = str.split("[a-z]+");
        try
        {
            digit = Integer.parseInt(digitsInStr[0]);
        }
        catch (NumberFormatException n){
            digit = Integer.parseInt(digitsInStr[1]);
        }
        return digit;
    }
}
