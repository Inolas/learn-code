package com.inolas.solutions.interview_assesments.GoldmanSachs;

import java.util.ArrayList;
import java.util.List;

public class GridGame
{
    public static int countLiveNeighbours(List<List<Integer>> grid, int i, int j)
    {
        int live_neighbours = 0;

        int ni_from = i - 1, ni_to = i + 1;
        int nj_from = j - 1, nj_to = j + 1;

        if (i == 0) ni_from = i;
        if (j == 0) nj_from = j;

        if (i == grid.size() - 1) ni_to = i;
        if (j == grid.get(0).size() - 1) nj_to = j;

        for (int ni = ni_from; ni <= ni_to; ni++)
        {
            for (int nj = nj_from; nj <= nj_to; nj++)
            {
                if (!(ni == i && nj == j))
                {
                    if (grid.get(ni).get(nj) == 1)
                        live_neighbours++;
                }
            }
        }
        return live_neighbours;
    }

    public static List<List<Integer>> gridGame(List<List<Integer>> grid, int k, List<String> rules){

        int lc[][] = new int[grid.size()][grid.get(0).size()];

        for(int l = 0;l < k; l++){
            for(int i = 0; i < grid.size(); i++){
                for(int j = 0; j < grid.get(0).size(); j++){
                    lc[i][j] = countLiveNeighbours(grid, i, j);
                }
            }

            for(int i = 0; i < grid.size(); i++){
                for(int j = 0; j < grid.get(0).size(); j++){
                    if(rules.get(lc[i][j]).equals("alive")){
                        grid.get(i).set(j, 1);
                    } else {
                        grid.get(i).set(j, 0);
                    }
                }
            }
            System.out.println(grid);
        }

        return grid;

    }

    public static void main(String[] args)
    {
        List<List<Integer>> grid = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(0); l1.add(1);l1.add(0);l1.add(0);
        List<Integer> l2 = new ArrayList<>();
        l2.add(0);l2.add(0);l2.add(0);l2.add(0);
        grid.add(l1);grid.add(l2);
        List<String> rules = new ArrayList<>();
        rules.add("dead");rules.add("alive");rules.add("dead");rules.add("dead");
        rules.add("dead");rules.add("dead");rules.add("dead");rules.add("dead");
        rules.add("dead");rules.add("dead");
        System.out.println(gridGame(grid, 1, rules));
    }
}
