package com.inolas.tests.interview_assesments.Amazon;

import com.inolas.solutions.interview_assesments.Amazon._0_ArticulationPoints;
import org.junit.Test;

public class _ArticulationPointsTest
{
    _0_ArticulationPoints ap = new _0_ArticulationPoints();
    @Test
    public void test1()
    {
        int numRouters = 7;
        int numLinks = 7;
        int[][] links = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 5}, {5, 6}, {3, 4}};
        System.out.println(ap.getCriticalNodes(links, numLinks, numRouters));
    }
}