package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0136_singleNumberTest {

    private A0136_singleNumber client;

    @Before
    public void setUp() throws Exception {
        client = new A0136_singleNumber();
    }

    @Test
    public void singleNumber() {
        assertEquals(4, client.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}