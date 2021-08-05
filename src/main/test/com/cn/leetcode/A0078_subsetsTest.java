package com.cn.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class A0078_subsetsTest {


    @Test
    public void subsets() {
        A0078_subsets.Solution solution = new A0078_subsets.MySolution();
        List<List<Integer>> subsets = solution.subsets(new int[]{1, 2, 3});
        System.out.println(subsets);
    }
}