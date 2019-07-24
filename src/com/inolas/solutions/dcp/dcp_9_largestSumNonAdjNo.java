package com.inolas.solutions.dcp;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class dcp_9_largestSumNonAdjNo
{
    /*
    * Given a list of integers, write a function that returns the largest sum
    * of non-adjacent numbers. Numbers can be 0 or negative.
    * For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5.
    * [5, 1, 1, 5] should return 10, since we pick 5 and 5.
    * Follow-up: Can you do this in O(N) time and constant space?
    * */
    public static int largestSum(int[] array)
    {
        int maxSum = 0;
        int skip = 2;
        HashSet<Integer> sum = new HashSet<Integer>();
        while (skip < array.length){
            for (int i = 0; i < array.length; i++)
            {
                int subSetSum = array[i];
                for (int j = i + skip; j < array.length; j += skip)
                {
                    subSetSum += array[j];

                }
                sum.add(subSetSum);
            }
            skip++;
        }
        Iterator<Integer> it = sum.iterator();
        int max = -999999;
        while (it.hasNext()){
            int number = it.next();
            if(number > max)
                max = number;
        }
        System.out.println(max);
        return maxSum;
    }
    /*
     * skip, keep incrementing skip; condition array size - skip - 1 == index break
     * and increment skip after;
     *
     * */
    public static void main(String[] args)
    {
        largestSum(new int[]{2, 4, 6, 2, 5});
        largestSum(new int[]{5, 1, 1, 5});
    }
}
