package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class A0739_dailyTemperaturesTest {

    private A0739_dailyTemperatures client;

    @Before
    public void setUp() throws Exception {
        client = new A0739_dailyTemperatures();
    }

    @Test
    public void dailyTemperatures() {
        assertEquals("[1, 1, 4, 2, 1, 1, 0, 0]", Arrays.toString(client.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }

    @Test
    public void dailyTemperatures2() {
        assertEquals("[1, 1, 4, 2, 1, 1, 0, 0]", Arrays.toString(client.dailyTemperatures2(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }

    @Test
    public void dailyTemperatures3() {
        assertEquals("[1, 1, 4, 2, 1, 1, 0, 0]", Arrays.toString(client.dailyTemperatures3(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
}