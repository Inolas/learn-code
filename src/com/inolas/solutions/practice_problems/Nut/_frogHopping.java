package com.inolas.solutions.practice_problems.Nut;

public class _frogHopping
{
    public static int frog(int n, int[] arr){
        int i = 0, count = 0;
        while(n>0){
            n = n - arr[i];
            i = arr[i];
            count++;
        }

        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(frog(8, new int[]{2,1,4,3,2,5,1,6}));
        System.out.println(frog(10, new int[]{4,3,2,6,8,3,1,9,6,2}));
    }
}
