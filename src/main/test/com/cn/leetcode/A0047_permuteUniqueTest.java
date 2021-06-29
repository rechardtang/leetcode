package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class A0047_permuteUniqueTest {

    private A0047_permuteUnique client;

    @Before
    public void setUp() throws Exception {
        client = new A0047_permuteUnique();
    }

    @Test
    public void permuteUnique() {

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 1, 2));
        expected.add(Arrays.asList(1, 2, 1));
        expected.add(Arrays.asList(2, 1, 1));
        assertEquals(expected, client.permuteUnique(new int[]{1, 1, 2}));

        expected.clear();

        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(1, 3, 2));
        expected.add(Arrays.asList(2, 1, 3));
        expected.add(Arrays.asList(2, 3, 1));
        expected.add(Arrays.asList(3, 1, 2));
        expected.add(Arrays.asList(3, 2, 1));
        assertEquals(expected, client.permuteUnique(new int[]{1, 2, 3}));

    }
}