package com.cn.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A0045_jumpTest {

    @Test
    public void jumpGreedySolution() {
        A0045_jump.Solution solution = new A0045_jump.GreedySolution();
        assertEquals(0, solution.jump(new int[]{0}));
        assertEquals(0, solution.jump(new int[]{1}));
        assertEquals(1, solution.jump(new int[]{1, 2}));
        assertEquals(2, solution.jump(new int[]{1, 2, 3}));
        assertEquals(1, solution.jump(new int[]{3, 2, 1}));
        assertEquals(2, solution.jump(new int[]{2, 3, 1, 1, 4}));
        assertEquals(2, solution.jump(new int[]{2, 3, 0, 1, 4}));
        assertEquals(2, solution.jump(new int[]{2, 0, 2, 0, 1}));
        assertEquals(3, solution.jump(new int[]{3, 4, 3, 2, 5, 4, 3}));
        assertEquals(5, solution.jump(new int[]{5, 6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 8, 2, 6, 8, 1, 5, 9, 6, 5, 2, 7, 9, 7, 9, 6, 9, 4, 1, 6, 8, 8, 4, 4, 2, 0, 3, 8, 5}));
    }

    @Test
    public void jumpGreedyBackSolution() {
        A0045_jump.Solution solution = new A0045_jump.GreedyBackSolution();
        assertEquals(0, solution.jump(new int[]{0}));
        assertEquals(0, solution.jump(new int[]{1}));
        assertEquals(1, solution.jump(new int[]{1, 2}));
        assertEquals(2, solution.jump(new int[]{1, 2, 3}));
        assertEquals(1, solution.jump(new int[]{3, 2, 1}));
        assertEquals(2, solution.jump(new int[]{2, 3, 1, 1, 4}));
        assertEquals(2, solution.jump(new int[]{2, 3, 0, 1, 4}));
        assertEquals(2, solution.jump(new int[]{2, 0, 2, 0, 1}));
        assertEquals(3, solution.jump(new int[]{3, 4, 3, 2, 5, 4, 3}));
        assertEquals(5, solution.jump(new int[]{5, 6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 8, 2, 6, 8, 1, 5, 9, 6, 5, 2, 7, 9, 7, 9, 6, 9, 4, 1, 6, 8, 8, 4, 4, 2, 0, 3, 8, 5}));
    }

    @Test
    public void jumpDfsSolution() {
        A0045_jump.Solution solution = new A0045_jump.DfsSolution();
        assertEquals(0, solution.jump(new int[]{0}));
        assertEquals(0, solution.jump(new int[]{1}));
        assertEquals(1, solution.jump(new int[]{1, 2}));
        assertEquals(2, solution.jump(new int[]{1, 2, 3}));
        assertEquals(1, solution.jump(new int[]{3, 2, 1}));
        assertEquals(2, solution.jump(new int[]{2, 3, 1, 1, 4}));
        assertEquals(2, solution.jump(new int[]{2, 3, 0, 1, 4}));
        assertEquals(2, solution.jump(new int[]{2, 0, 2, 0, 1}));
        assertEquals(3, solution.jump(new int[]{3, 4, 3, 2, 5, 4, 3}));
        assertEquals(12, solution.jump(new int[]{5, 6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 8, 2, 6, 8, 1, 5, 9, 6, 5, 2, 7, 9, 7, 9, 6, 9, 4, 1, 6, 8, 8, 4, 4, 2, 0, 3, 8, 5}));
    }
}