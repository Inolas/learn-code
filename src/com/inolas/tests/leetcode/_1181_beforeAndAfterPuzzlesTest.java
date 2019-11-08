package com.inolas.tests.leetcode;

import com.inolas.solutions.leetcode._1181_beforeAndAfterPuzzles;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class _1181_beforeAndAfterPuzzlesTest
{
    _1181_beforeAndAfterPuzzles baap = new _1181_beforeAndAfterPuzzles();
    @Test
    public void test1(){
        baap.before_after_puzzles(Arrays.asList("writing code", "code rocks"));
    }
    @Test
    public void test2(){
        baap.before_after_puzzles(Arrays.asList("mission statement", "a quick bite to eat",
                "a chip off the old block", "chocolate bar", "mission impossible",
                "a man on a mission", "block party", "eat my words", "bar of soap"));
    }
    @Test
    public void test3(){
        baap.before_after_puzzles(Arrays.asList("a","b","a"));
    }
}