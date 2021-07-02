package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0202_isHappyTest {

    private A0202_isHappy client;

    @Before
    public void setUp() throws Exception {
        client = new A0202_isHappy();
    }

    @Test
    public void isHappy() {
        assertTrue(client.isHappy(1));
        assertFalse(client.isHappy(2));
        assertFalse(client.isHappy(3));
        assertFalse(client.isHappy(4));
        assertFalse(client.isHappy(5));
        assertFalse(client.isHappy(6));
        assertTrue(client.isHappy(7));
        assertFalse(client.isHappy(8));
        assertFalse(client.isHappy(9));
    }
}