package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0038_countAndSayTest {

    private A0038_countAndSay client;

    @Before
    public void setUp() throws Exception {
        client = new A0038_countAndSay();
    }

    @Test
    public void countAndSay() {
        assertEquals("1", client.countAndSay(1));
        assertEquals("11", client.countAndSay(2));
        assertEquals("21", client.countAndSay(3));
        assertEquals("1211", client.countAndSay(4));
        assertEquals("111221", client.countAndSay(5));
    }
}