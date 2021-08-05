package com.cn.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A0128_longestConsecutiveTest {

    @Test
    public void longestConsecutiveBruteForceSolution() {
        A0128_longestConsecutive.Solution solution = new A0128_longestConsecutive.BruteForceSolution();
        assertEquals(4, solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        assertEquals(9, solution.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

    @Test
    public void longestConsecutiveHashSetSolution() {
        A0128_longestConsecutive.Solution solution = new A0128_longestConsecutive.HashSetSolution();
        assertEquals(4, solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        assertEquals(9, solution.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

    @Test
    public void longestConsecutiveSortingSolution() {
        A0128_longestConsecutive.Solution solution = new A0128_longestConsecutive.SortingSolution();
        assertEquals(0, solution.longestConsecutive(new int[]{}));
        assertEquals(1, solution.longestConsecutive(new int[]{1}));
        assertEquals(3, solution.longestConsecutive(new int[]{1, 2, 0, 1}));
        assertEquals(4, solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        assertEquals(9, solution.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }
}