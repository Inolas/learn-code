package com.inolas.solutions.ctci;

public class c1_3_URLify
{
    public String urlify(String input, int outLength)
    {
        StringBuilder sb = new StringBuilder();

        for(int i = outLength - 1; i >= 0; i-- )
        {
            if(input.charAt(i) == ' ')
                sb.append("02%");
            else
                sb.append(input.charAt(i));
        }
        sb.reverse();
        return sb.toString();
    }
}
