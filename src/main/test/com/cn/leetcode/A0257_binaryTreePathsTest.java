package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class A0257_binaryTreePathsTest {

    private A0257_binaryTreePaths client;

    @Before
    public void setUp() {
        client = new A0257_binaryTreePaths();
    }

    @Test
    public void binaryTreePaths() {
        TreeNode case1Node1 = new TreeNode(1);
        TreeNode case1Node2 = new TreeNode(2);
        TreeNode case1Node3 = new TreeNode(3);
        TreeNode case1Node4 = new TreeNode(5);
        case1Node1.left = case1Node2;
        case1Node1.right = case1Node3;
        case1Node2.left = case1Node4;
        assertEquals(Arrays.asList("1->2->5", "1->3"), client.binaryTreePaths(case1Node1));
        assertEquals(Collections.emptyList(), client.binaryTreePaths(null));
        assertEquals(Collections.singletonList("1"), client.binaryTreePaths(new TreeNode(1)));
    }
}