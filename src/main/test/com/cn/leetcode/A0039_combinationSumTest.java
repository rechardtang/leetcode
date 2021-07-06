package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class A0039_combinationSumTest {

    private A0039_combinationSum client;

    @Before
    public void setUp() throws Exception {
        client = new A0039_combinationSum();
    }

    @Test
    public void combinationSumDfsSolution() {
        A0039_combinationSum.Problem solution = new A0039_combinationSum.DfsSolution();
        List<List<Integer>> lists = solution.combinationSum(new int[]{1, 2, 3}, 3);
//        List<List<Integer>> lists = solution.combinationSum(new int[]{2, 3, 6, 7}, 7);
//        System.out.println(lists);
    }

    @Test
    public void combinationSum() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(7));
        expected.add(asList(2, 2, 3));
        assertEquals(expected, client.combinationSum(new int[]{2, 3, 6, 7}, 7));

        expected.clear();

        expected.add(asList(3, 5));
        expected.add(asList(2, 3, 3));
        expected.add(asList(2, 2, 2, 2));
        assertEquals(expected, client.combinationSum(new int[]{2, 3, 5}, 8));
    }
}