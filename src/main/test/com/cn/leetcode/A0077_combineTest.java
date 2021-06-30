package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class A0077_combineTest {

    private A0077_combine client;

    @Before
    public void setUp() throws Exception {
        client = new A0077_combine();
    }

    @Test
    public void combine() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(1, 4));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(2, 4));
        expected.add(Arrays.asList(3, 4));
        assertEquals(expected, client.combine(4, 2));
    }
}