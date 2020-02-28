package com.inolas.solutions.dcp;
/*
* INPUT : 2,3,6,8,4,5
*           2,8,6,4,3,5
* OUTPUT: 2,4,6,8,3,5
* */
public class _1112_evenOddSort
{
    public int[] evenOddSort(int[] input)
    {
        int evenCounter = 0;
        int inputLen = input.length;

        for (int i = 0; i < inputLen; i++){
            if(input[i] % 2 == 0)
                evenCounter++;
        }

        for (int i = 0; i < inputLen; i++)
        {
            for (int j = 0; j < inputLen; j++)
            {
                if(input[i] % 2 == 0 && input[j] % 2 == 0 )
                {
                    continue;
                }
                else if(input[i] % 2 == 0)
                {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        for (int i = 0; i < evenCounter; i++)
        {
            for (int j = i+1; j < evenCounter; j++)
            {
                if(input[i] > input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        for (int i = evenCounter; i < inputLen; i++)
        {
            for (int j = i+1; j < inputLen; j++)
            {
                if(input[i] > input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }

}
//
//
//if(input[i] > input[j]){
//        int temp = input[i];
//        input[i] = input[j];
//        input[j] = temp;
//        }