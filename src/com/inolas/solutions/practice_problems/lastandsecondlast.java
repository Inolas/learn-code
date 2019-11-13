package com.inolas.solutions.practice_problems;

public class lastandsecondlast
{
    public String lastLetters(String str){
        StringBuilder lastLetters = new StringBuilder();

        if(str.length() >= 2)
        {
            lastLetters.append(str.charAt(str.length() - 1));
            lastLetters.append(" ");
            lastLetters.append(str.charAt(str.length() - 2));
        }

        return lastLetters.toString();
    }
}
