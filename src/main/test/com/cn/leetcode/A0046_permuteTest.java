package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class A0046_permuteTest {

    private A0046_permute client;

    @Before
    public void setUp() throws Exception {
        client = new A0046_permute();
    }

    @Test
    public void permuteCustomStackDfsSolution() {
        A0046_permute.Problem solution = new A0046_permute.CustomStackDfsSolution();
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> path1 = Arrays.asList(1, 2, 3);
        List<Integer> path2 = Arrays.asList(1, 3, 2);
        List<Integer> path3 = Arrays.asList(2, 1, 3);
        List<Integer> path4 = Arrays.asList(2, 3, 1);
        List<Integer> path5 = Arrays.asList(3, 1, 2);
        List<Integer> path6 = Arrays.asList(3, 2, 1);
        expected.add(path1);
        expected.add(path2);
        expected.add(path3);
        expected.add(path4);
        expected.add(path5);
        expected.add(path6);
        assertEquals(expected, solution.permute(new int[]{1, 2, 3}));
    }

    @Test
    public void permute() {
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> path1 = Arrays.asList(1, 2, 3);
        List<Integer> path2 = Arrays.asList(1, 3, 2);
        List<Integer> path3 = Arrays.asList(2, 1, 3);
        List<Integer> path4 = Arrays.asList(2, 3, 1);
        List<Integer> path5 = Arrays.asList(3, 1, 2);
        List<Integer> path6 = Arrays.asList(3, 2, 1);
        expected.add(path1);
        expected.add(path2);
        expected.add(path3);
        expected.add(path4);
        expected.add(path5);
        expected.add(path6);
        assertEquals(expected, client.permute(new int[]{1, 2, 3}));
    }
}