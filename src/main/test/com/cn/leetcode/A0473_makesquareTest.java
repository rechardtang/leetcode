package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0473_makesquareTest {

    private A0473_makesquare client;

    @Before
    public void setUp() {
        client = new A0473_makesquare();
    }

    @Test
    public void makesquare() {
        assertTrue(client.makesquare(new int[]{1, 1, 2, 2, 2}));
        assertFalse(client.makesquare(new int[]{3, 3, 3, 3, 4}));
        assertTrue(client.makesquare(new int[]{5, 5, 5, 5, 4, 4, 4, 4, 3, 3, 3, 3}));
    }
}