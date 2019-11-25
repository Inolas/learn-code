package com.inolas.solutions.practice_problems.xtn;

public class _beautifulRow
{
    int rowLength;
    int count = 0;

    public int beautifulRow(int[] row){
        rowLength = row.length;

        count = beautifulRow_helper(row, 0, rowLength);

        return count;
    }

    private int beautifulRow_helper(int[] row, int start, int end)
    {
        int maxIndex;
        maxIndex = maxIndex(row, start, end);

        if(checkIfRightIsSorted(row, maxIndex) && checkIfLeftIsSorted(row, maxIndex))
            return count;

        if(!checkIfLeftIsSorted(row, maxIndex)){
            count++;
            row = arrDeleteMax(row, maxIndex);

            beautifulRow_helper(row, 0, maxIndex);
        }
        if(!checkIfRightIsSorted(row, maxIndex)){
            count++;
            row = arrDeleteMax(row, maxIndex);

            int index = maxIndex;
            beautifulRow_helper(row, index, rowLength);

        }
        return count;
    }

    public int maxIndex(int[] row, int start, int end){
        int max = row[start];
        int maxIndex = start;
        for(int i = start+1; i < end; i++){
            if(max < row[i]){
                max = row[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private int[] arrDeleteMax(int[] row, int maxIndex)
    {
        for(int i=0; i<row.length - 1; i++){

            if(i >= maxIndex)
                row[i] = row[i+1];
        }
        rowLength--;
        return row;
    }

    private boolean checkIfRightIsSorted(int[] row, int index)
    {
        for(int i = index; i < rowLength - 1; i++){
            if(row[i] < row[i+1]){
                return false;
            }
        }
        return true;
    }

    private boolean checkIfLeftIsSorted(int[] row, int index)
    {
        for(int i = index; i > 1; i--){
            if(row[i] < row[i-1]){
                return false;
            }
        }
        return true;
    }
}
