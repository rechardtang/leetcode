package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class A0015_threeSumTest {
    private A0015_threeSum client;

    @Before
    public void setUp() {
        client = new A0015_threeSum();
    }

    @Test
    public void threeSum() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(-1, -1, 2));
        list.add(Arrays.asList(-1, 0, 1));
        assertEquals(list, client.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        assertEquals(Collections.emptyList(), client.threeSum(new int[]{}));
        assertEquals(Collections.emptyList(), client.threeSum(new int[]{0}));
    }

    @Test
    public void threeSum2() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(-1, -1, 2));
        list.add(Arrays.asList(-1, 0, 1));
        assertEquals(list, client.threeSum2(new int[]{-1, 0, 1, 2, -1, -4}));
        assertEquals(Collections.emptyList(), client.threeSum2(new int[]{}));
        assertEquals(Collections.emptyList(), client.threeSum2(new int[]{0}));
    }

}