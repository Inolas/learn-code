package com.inolas.solutions.algorithms;

public class _minimumSubsequenceSum
{
    public static int mss(int[] array, int left, int right)
    {
        int maxSum=0, ml, mr, msss;
        int mid = (left + right)/2;
        if(left > right)
        {
            ml = mss(array, left, mid);
            if (maxSum > ml)
            {

            }
            mr = mss(array, mid, right);
            msss = ml + mr;
        }
        return maxSum;
    }

    public static int main(int[] array){
        return 0;
    }
}
