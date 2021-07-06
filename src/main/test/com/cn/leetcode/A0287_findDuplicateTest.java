package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0287_findDuplicateTest {

    private A0287_findDuplicate client;

    @Before
    public void setUp() throws Exception {
        client = new A0287_findDuplicate();
    }

    @Test
    public void findDuplicate() {
        assertEquals(3, client.findDuplicate(new int[]{3, 1, 3, 4, 2}));
        assertEquals(2, client.findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }
}