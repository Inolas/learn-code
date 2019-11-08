package com.inolas.solutions.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _118_PascalsTriangle
{
    public List<List<Integer>> triangle(int numRows){
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();

        for (int i = 0; i < numRows; i++)
        {
            row.add(0,1);
            for (int j = 1; j < i; j++)
            {
                row.set(j, row.get(j-1)+row.get(j));
            }
            triangle.add(new ArrayList<>(row));
        }

        return triangle;
    }
}
