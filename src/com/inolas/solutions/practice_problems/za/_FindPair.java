package com.inolas.solutions.practice_problems.za;

public class _FindPair
{
    public int a;
    public int b;
    public _FindPair(){}
    _FindPair(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString()
    {
        String str = this.a+", "+this.b;
        return str;
    }

    public static _FindPair find(int[][] input, int target){
        _FindPair pair = new _FindPair(-1,-1);
        int row = input.length-1;
        int col = 0;
        while(row >=0 && col < input[0].length){
            if(input[row][col] < target){
                col++;
            }
            else if(input[row][col] > target){
                row--;
            }
            else
                return new _FindPair(row,col);
        }

        return pair;
    }
}
