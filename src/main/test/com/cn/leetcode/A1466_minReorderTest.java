package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A1466_minReorderTest {

    private A1466_minReorder client;

    @Before
    public void setUp() throws Exception {
        client = new A1466_minReorder();
    }

    @Test
    public void minReorder() {
        assertEquals(3, client.minReorder(6, new int[][]{
                {0, 1},
                {1, 3},
                {2, 3},
                {4, 0},
                {4, 5},
        }));
        assertEquals(2, client.minReorder(5, new int[][]{
                {1, 0},
                {1, 2},
                {3, 2},
                {3, 4},
        }));
        assertEquals(0, client.minReorder(3, new int[][]{
                {1, 0},
                {2, 0},
        }));
    }
}