package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0073_setZeroesTest {

    private A0073_setZeroes client;

    @Before
    public void setUp() throws Exception {
        client = new A0073_setZeroes();
    }

    @Test
    public void setZeroes() {

        int[][] a1 = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1},
        };
        int[][] expected = new int[][]{
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1},
        };
        client.setZeroes(a1);
        assertArrayEquals(expected, a1);


        int[][] a2 = new int[][]{
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5},
        };
        expected = new int[][]{
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0},
        };
        client.setZeroes(a2);
        assertArrayEquals(expected, a2);
    }
}