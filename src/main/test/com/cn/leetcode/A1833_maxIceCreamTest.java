package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A1833_maxIceCreamTest {

    private A1833_maxIceCream client;

    @Before
    public void setUp() throws Exception {
        client = new A1833_maxIceCream();
    }

    @Test
    public void maxIceCream() {
        assertEquals(4, client.maxIceCream(new int[]{1, 3, 2, 4, 1}, 7));
        client.max = 0;
        assertEquals(0, client.maxIceCream(new int[]{10, 6, 8, 7, 7, 8}, 5));
        client.max = 0;
        assertEquals(6, client.maxIceCream(new int[]{1, 6, 3, 1, 2, 5}, 20));
        client.max = 0;
        assertEquals(9, client.maxIceCream(new int[]{7, 3, 3, 6, 6, 6, 10, 5, 9, 2}, 56));
    }
}