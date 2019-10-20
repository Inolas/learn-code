package com.inolas.solutions.leetcode.Contests;

public class weeklyContest159
{
    /*
    * slope = y2 - y1 / x2 - x1
    * */
    public static boolean isStraigthLine(int[][] coordinates) {
        if(coordinates.length < 2)
            return false;

        if (coordinates[1][0] - coordinates[0][0] == 0)
            return false;

        int slopeM = (coordinates[1][1] - coordinates[0][1]) / (coordinates [1][0] - coordinates [0][0]);

        for (int i = 0; i < coordinates.length - 1; i++){
            if((coordinates[i+1][1] - coordinates[i][1]) / (coordinates [i+1][0] - coordinates [i][0]) != slopeM)
                return false;
        }
        return true;
    }
}
