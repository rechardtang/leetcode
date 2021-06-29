package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0029_divideTest {

    private A0029_divide client;

    @Before
    public void setUp() throws Exception {
        client = new A0029_divide();
    }

    @Test
    public void divide() {
        assertEquals(3, client.divide(10, 3));
        assertEquals(-2, client.divide(7, -3));
        assertEquals(-2, client.divide(-7, 3));
        assertEquals(2, client.divide(-7, -3));
        assertEquals(2147483647, client.divide(-2147483648, -1));
    }
}