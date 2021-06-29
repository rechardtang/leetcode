package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0031_nextPermutationTest {

    private A0031_nextPermutation client;

    @Before
    public void setUp() throws Exception {
        client = new A0031_nextPermutation();
    }

    @Test
    public void nextPermutation() {

        int[] nums = new int[]{1, 2, 3};
        client.nextPermutation(nums);
        assertArrayEquals(new int[]{1, 3, 2}, nums);

        nums = new int[]{1, 3, 2};
        client.nextPermutation(nums);
        assertArrayEquals(new int[]{2, 1, 3}, nums);

        nums = new int[]{2, 1, 3};
        client.nextPermutation(nums);
        assertArrayEquals(new int[]{2, 3, 1}, nums);

        nums = new int[]{2, 3, 1};
        client.nextPermutation(nums);
        assertArrayEquals(new int[]{3, 1, 2}, nums);

        nums = new int[]{3, 1, 2};
        client.nextPermutation(nums);
        assertArrayEquals(new int[]{3, 2, 1}, nums);

        nums = new int[]{3, 2, 1};
        client.nextPermutation(nums);
        assertArrayEquals(new int[]{1, 2, 3}, nums);

    }
}