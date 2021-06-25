package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0064_minPathSumTest {

    private A0064_minPathSum client;

    @Before
    public void setUp() throws Exception {
        client = new A0064_minPathSum();
    }

    @Test
    public void minPathSum() {
        assertEquals(1, client.minPathSum(new int[][]{
                {1},
        }));
        assertEquals(7, client.minPathSum(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1},
        }));
        assertEquals(12, client.minPathSum(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
        }));
    }
}