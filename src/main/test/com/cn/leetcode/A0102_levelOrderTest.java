package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class A0102_levelOrderTest {

    private A0102_levelOrder client;

    @Before
    public void setUp() throws Exception {
        client = new A0102_levelOrder();
    }

    @Test
    public void levelOrder() {
        TreeNode case1Node1 = new TreeNode(3);
        TreeNode case1Node2 = new TreeNode(9);
        TreeNode case1Node3 = new TreeNode(20);
        TreeNode case1Node4 = new TreeNode(15);
        TreeNode case1Node5 = new TreeNode(7);
        case1Node1.left = case1Node2;
        case1Node1.right = case1Node3;
        case1Node3.left = case1Node4;
        case1Node3.right = case1Node5;
        List<List<Integer>> list = new ArrayList<>();
        list.add(Collections.singletonList(3));
        list.add(Arrays.asList(9, 20));
        list.add(Arrays.asList(15, 7));
        assertEquals(list, client.levelOrder(case1Node1));
    }
}