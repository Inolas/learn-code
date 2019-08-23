package com.inolas.solutions.algorithms;

public class _kadanesAlgo
{
    /*
    * Try using for each loop
    * */
    public static int kadanesAlgorithm(int[] array)
    {
        int maxSum = array[0];
        int currentMax = array[0];
        for (int i = 1; i < array.length; i++)
        {
            currentMax = ((currentMax + array[i]) > array[i]) ? (currentMax + array[i]) : array[i];
            maxSum = (maxSum > currentMax) ? maxSum : currentMax;
        }
        System.out.println(maxSum);
        return maxSum;
    }
}
