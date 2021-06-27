package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0149_maxPointsTest {

    private A0149_maxPoints client;

    @Before
    public void setUp() {
        client = new A0149_maxPoints();
    }

    @Test
    public void maxPoints() {
        assertEquals(3, client.maxPoints(new int[][]{
                {1, 1},
                {2, 2},
                {3, 3},
        }));
        assertEquals(4, client.maxPoints(new int[][]{
                {1, 1},
                {3, 2},
                {5, 3},
                {4, 1},
                {2, 3},
                {1, 4},
        }));
    }

}