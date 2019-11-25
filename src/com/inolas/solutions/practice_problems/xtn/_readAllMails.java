package com.inolas.solutions.practice_problems.xtn;

public class _readAllMails
{
    public static int solve(int[] arr){
        int clicks = 0;
        int prev = arr[0], curr = arr[0];

        for(int i = 0; i < arr.length; i++){
            prev = curr;
            curr = arr[i];
            if(curr == 1)
                clicks++;
            else if(prev == 1 && curr == 0)
                clicks++;
            else if(prev == 0 && curr == 1)
                clicks++;
            else if(prev == 1 && curr == 1)
                clicks++;

        }
        return clicks;
    }

    public static void main(String[] args)
    {
        System.out.println(solve(new int[]{1,1,0,0,1}));
        System.out.println(solve(new int[]{0,0}));
    }
}
