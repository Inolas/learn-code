package com.inolas.solutions.practice_problems.xtn;

public class __0_pizzaTreats
{
    public String pizzaTreats(int[] visitors){
        int i = 0;
        for(i = 0; i < visitors.length - 1; i++){
            if(visitors[i] % 2 > 1)
                return "NO";
            else{
                visitors[i+1] -= (visitors[i] % 2);
            }
        }

        return visitors[i] % 2 != 0 ? "NO" : "YES";
    }
}
