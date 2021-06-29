package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0027_removeElementTest {

    private A0027_removeElement client;

    @Before
    public void setUp() throws Exception {
        client = new A0027_removeElement();
    }

    @Test
    public void removeElement() {
        assertEquals(2, client.removeElement(new int[]{3,2,2,3},3));
        assertEquals(2, client.removeElement(new int[]{2,2,3},3));
        assertEquals(0, client.removeElement(new int[]{1,1,1,1},1));
        assertEquals(0, client.removeElement(new int[]{},0));
        assertEquals(1, client.removeElement(new int[]{2},3));
        assertEquals(2, client.removeElement(new int[]{3,3},5));
        assertEquals(1, client.removeElement(new int[]{4,5},5));
        assertEquals(5, client.removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
}