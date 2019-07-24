package com.inolas.solutions.dcp;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class $dcp_9_largestSumNonAdjNo
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
        HashSet<Integer> sum = new HashSet<Integer>();
        int skip = 2;

        while (skip < array.length){
            for (int i = 0; i < array.length; i++)
            {
                int subSetSum = array[i];
                for (int j = i + skip; j < array.length; j += skip)
                {
                    subSetSum += array[j];
                    sum.add(subSetSum);
                }
            }
            skip++;
        }

        Iterator<Integer> itr = sum.iterator();
        int max = Integer.MIN_VALUE;
        while (itr.hasNext()){
            int number = itr.next();
//            System.out.print(number+"|");
            if(number > max)
                max = number;
        }
        System.out.println(max);

        return max;
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
        largestSum(new int[]{1, -4, -9});
        largestSum(new int[]{2, 4, 6, 2, -1});
        largestSum(new int[]{3, 8, 9, 4, 5, 6});

    }
}
