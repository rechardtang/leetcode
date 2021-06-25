package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0104_maxDepthTest {

    private A0104_maxDepth client;

    @Before
    public void setUp() throws Exception {
        client = new A0104_maxDepth();
    }

    @Test
    public void maxDepth() {

        assertEquals(0, client.maxDepth(null));

        TreeNode case1Node1 = new TreeNode(3);
        TreeNode case1Node2 = new TreeNode(9);
        TreeNode case1Node3 = new TreeNode(20);
        TreeNode case1Node4 = new TreeNode(15);
        TreeNode case1Node5 = new TreeNode(7);
        case1Node1.left = case1Node2;
        case1Node1.right = case1Node3;
        case1Node3.left = case1Node4;
        case1Node3.right = case1Node5;
        assertEquals(3, client.maxDepth(case1Node1));

    }
}