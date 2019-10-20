package com.inolas.solutions.leetcode.Contests;

/*
* In some array arr, the values were in arithmetic progression:
* the values arr[i+1] - arr[i] are all equal for every 0 <= i < arr.length - 1.
* Then, a value from arr was removed that was not the first or last value in the array.
* Return the removed value.
*
* Input: arr = [5,7,11,13]        Output: 9
* Explanation: The previous array was [5,7,9,11,13].
*
* Input: arr = [15,13,12]         Output: 14
* Explanation: The previous array was [15,14,13,12].
*
* Constraints:        3 <= arr.length <= 1000         0 <= arr[i] <= 10^5
* */
public class biweeklyContest11
{
    public static int missingNumber(int[] series){
        int missing = 0;
        int d = (series[series.length - 1] - series[0])/ series.length;
        if(d==0)
            return series[0];
        int chk_d = 0;

        for (int i = 0; i < series.length ; i++){
            chk_d = series[i+1] - series[i];
            if(d != chk_d)
                return series[i]+d;
        }

        return missing;
    }

    public static void main(String[] args)
    {
        System.out.println(missingNumber(new int[]{5, 7, 11, 13}));
        System.out.println(missingNumber(new int[]{15, 13, 12}));
        System.out.println(missingNumber(new int[]{25, 15, 10, 5}));
        System.out.println(missingNumber(new int[]{2, 20, 38, 74, 92, 110}));
        System.out.println(missingNumber(new int[]{0, 0, 0, 0}));


    }
}
