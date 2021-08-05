package com.cn.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A0215_findKthLargestTest {


    @Test
    public void findKthLargest() {
        A0215_findKthLargest.Solution solution = new A0215_findKthLargest.MySolution();
        ;
        assertEquals(5, solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        assertEquals(4, solution.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

}