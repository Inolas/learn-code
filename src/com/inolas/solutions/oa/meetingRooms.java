package com.inolas.solutions.oa;

import com.inolas.solutions.algorithms._minimumSubsequenceSum;

import java.util.*;

public class meetingRooms
{

    public static int maxMeets(int[] starts, int[] ends){

        HashSet<Integer> meets_done = new HashSet<>();
        for (int i = 0; i < starts.length; i++)
        {
            for (int j = starts[i]; j <= ends[i]; j++)
            {
                if(!meets_done.contains(j)){
                    meets_done.add(j);
                    break;
                }
            }
        }
        return meets_done.size();
    }

    public static void main(String[] args)
    {

        int[] meetingsSTART = {1,2,1,2,2};
        int[] meetingsEND = {3,2,1,3,3};//3

//        int[] meetings1START = {1,10,11};
//        int[] meetings1END = {11,10,11};//3
//
//        int[] meetings1START = {1,1,2};
//        int[] meetings1END = {1,2,2};//2

//        int[] meetings1START = {1,2,};
//        int[] meetings1END = {1,2,2};//2

        int[] meetings1START = {1,3,3,5,7};
        int[] meetings1END = {3,5,4,7,8};//5

//        System.out.println(maxMeets(meetingsSTART, meetingsEND));
        System.out.println(maxMeets(meetings1START, meetings1END));
//        System.out.println(minMeetingRooms(meetings2));

    }
}
