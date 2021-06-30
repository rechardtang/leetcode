package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0071_simplifyPathTest {

    private A0071_simplifyPath client;

    @Before
    public void setUp() throws Exception {
        client = new A0071_simplifyPath();
    }

    @Test
    public void simplifyPath() {
        assertEquals("/", client.simplifyPath("/"));
        assertEquals("/", client.simplifyPath("/."));
        assertEquals("/", client.simplifyPath("/.."));
        assertEquals("/", client.simplifyPath("/../"));
        assertEquals("/home", client.simplifyPath("/home/"));
        assertEquals("/home/foo", client.simplifyPath("/home//foo/"));
        assertEquals("/c", client.simplifyPath("/a/./b/../../c/"));
    }
}