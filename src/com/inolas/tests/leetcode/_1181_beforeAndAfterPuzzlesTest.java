package com.inolas.tests.leetcode;
//Code - https://github.com/Inolas/learn-code/blob/master/src/com/inolas/solutions/leetcode/_1181_beforeAndAfterPuzzles.java;
import com.inolas.solutions.leetcode._1181_beforeAndAfterPuzzles;
import org.junit.Test;
import java.util.Arrays;

public class _1181_beforeAndAfterPuzzlesTest
{
    _1181_beforeAndAfterPuzzles baap = new _1181_beforeAndAfterPuzzles();
    @Test
    public void test1(){
        baap.beforeAfterPuzzles(Arrays.asList("writing code", "code rocks", "code code"));
    }
    @Test
    public void test2(){
        baap.beforeAfterPuzzles(Arrays.asList("mission statement", "a quick bite to eat",
                "a chip off the old block", "chocolate bar", "mission impossible",
                "a man on a mission", "block party", "eat my words", "bar of soap"));
    }
    @Test
    public void test3(){
        baap.beforeAfterPuzzles(Arrays.asList("a","b","a"));
    }
}