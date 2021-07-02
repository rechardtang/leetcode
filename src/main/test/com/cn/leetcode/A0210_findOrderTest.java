package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0210_findOrderTest {

    private A0210_findOrder client;

    @Before
    public void setUp() throws Exception {
        client = new A0210_findOrder();
    }

    @Test
    public void findOrder() {
        assertArrayEquals(new int[]{0, 1}, client.findOrder(2, new int[][]{
                {1, 0}
        }));
    }

    @Test
    public void findOrderBFS() {
        assertArrayEquals(new int[]{0, 1}, client.findOrderBFS(2, new int[][]{
                {1, 0}
        }));
    }
}