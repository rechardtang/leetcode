package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0050_myPowTest {

    private A0050_myPow client;

    @Before
    public void setUp() throws Exception {
        client = new A0050_myPow();
    }

    @Test
    public void myPow() {
        assertEquals(1024d, client.myPow(2d, 10), 0);
        assertEquals(9.261, client.myPow(2.1d, 3), 0.1);
        assertEquals(0.25, client.myPow(2d, -2), 0);
        assertEquals(1, client.myPow(2d, 0), 0);
        System.out.println(client.myPow(0.00001, 2147483647));
    }

}