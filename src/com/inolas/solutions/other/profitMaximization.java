package com.inolas.solutions.other;

public class profitMaximization
{
    public static int maxProfit(int[] input){
        int i=0, j=0;
        int maxProfit = input[i];
        while(j<input.length && i<input.length){

            if(input[j] % input[i] == 0 && i<j){
                maxProfit += input[j];
                i=j;
            }
            j++;
        }
        return maxProfit;
    }

    public static void main(String[] args)
    {
        System.out.println(maxProfit(new int[]{1,2,3,4,9,8}));
    }
}
