package com.inolas.tests.InterviewAssesments.GoldmanSachs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.inolas.solutions.interview_assesments.GoldmanSachs.GridGame.gridGame;

public class GridGameTest
{
    @Test
    public void test1(){
        List<List<Integer>> grid = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(0);  l1.add(1);l1.add(0);l1.add(0);
        List<Integer> l2 = new ArrayList<>();
        l2.add(0);l2.add(0);l2.add(0);l2.add(0);
        grid.add(l1);grid.add(l2);
        List<String> rules = new ArrayList<>();
        rules.add("dead");rules.add("alive");rules.add("dead");rules.add("dead");
        rules.add("dead");rules.add("alive");rules.add("dead");rules.add("dead");
        rules.add("dead");
        System.out.println(gridGame(grid, 2, rules));
    }
}