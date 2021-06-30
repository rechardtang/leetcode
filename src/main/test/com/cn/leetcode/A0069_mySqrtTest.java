package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0069_mySqrtTest {

    private A0069_mySqrt client;

    @Before
    public void setUp() throws Exception {
        client = new A0069_mySqrt();
    }

    @Test
    public void mySqrt() {
        assertEquals(0, client.mySqrt(0));
        assertEquals(1, client.mySqrt(1));
        assertEquals(2, client.mySqrt(4));
        assertEquals(2, client.mySqrt(8));
        assertEquals(4, client.mySqrt(17));
        // timeout
        assertEquals(46340, client.mySqrt(2147483647));
    }
}