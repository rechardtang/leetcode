package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0205_isIsomorphicTest {

    private A0205_isIsomorphic client;

    @Before
    public void setUp() throws Exception {
        client = new A0205_isIsomorphic();
    }

    @Test
    public void isIsomorphic() {
        assertTrue(client.isIsomorphic("egg", "add"));
        assertFalse(client.isIsomorphic("foo", "bar"));
        assertTrue(client.isIsomorphic("paper", "title"));
        assertFalse(client.isIsomorphic("badc", "baba"));
    }
}