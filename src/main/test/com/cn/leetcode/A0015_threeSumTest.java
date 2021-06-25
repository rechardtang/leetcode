package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class A0015_threeSumTest {
    private A0015_threeSum a;

    @Before
    public void setUp() {
        a = new A0015_threeSum();
    }

    @Test
    public void threeSum() {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(-1, -1, 2);
        List<Integer> list2 = Arrays.asList(-1, 0, 1);
        list.add(list1);
        list.add(list2);
        assertEquals(list, a.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        assertEquals(Collections.emptyList(), a.threeSum(new int[]{}));
        assertEquals(Collections.emptyList(), a.threeSum(new int[]{0}));
    }

}