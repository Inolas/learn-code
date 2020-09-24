package com.inolas.solutions.oa;

import java.util.List;

public class _slowestKey
{
    public static char slowestKey(int[][] keyTimes){
        int maxDiff = keyTimes[0][1];
        int maxDiff_index=0;
//        int diff;
        for (int i = 1; i < keyTimes.length; i++)
        {
            int diff = keyTimes[i][1] - keyTimes[i-1][1];
            if(diff > maxDiff){
                maxDiff = diff;
                maxDiff_index = i;
            }
        }

        return (char) (keyTimes[maxDiff_index][0] + 97);
    }

    public static void main(String[] args)
    {
//        int[][] keys= {{0,2},{1,3},{0,7} };
//        int[][] keys= {{0,1},{0,3},{4,5},{5,6},{4,10} };
//                int[][] keys= {{0,2},{1,5},{0,9},{2,15}};
        int[][] keys= {{0,3},{20,5},{2,6},{15,7},{9,8},{19,9},{24,10},{4,12},{6,13} };

        System.out.println(slowestKey(keys));
    }
}
