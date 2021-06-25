package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0112_hasPathSumTest {

    private A0112_hasPathSum client;

    @Before
    public void setUp() throws Exception {
        client = new A0112_hasPathSum();
    }

    @Test
    public void hasPathSum() {
        assertFalse(client.hasPathSum(null, 1));
        assertTrue(client.hasPathSum(new TreeNode(1), 1));
        assertFalse(client.hasPathSum(new TreeNode(1), 2));

        TreeNode case1Node1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertFalse(client.hasPathSum(case1Node1, 5));

        TreeNode case2Node1 = new TreeNode(1, new TreeNode(2), null);
        assertFalse(client.hasPathSum(case2Node1, 0));

        TreeNode case3Node1 = new TreeNode(5);
        TreeNode case3Node2 = new TreeNode(4);
        TreeNode case3Node3 = new TreeNode(8);
        TreeNode case3Node4 = new TreeNode(11);
        TreeNode case3Node5 = new TreeNode(13);
        TreeNode case3Node6 = new TreeNode(4);
        TreeNode case3Node7 = new TreeNode(7);
        TreeNode case3Node8 = new TreeNode(2);
        TreeNode case3Node9 = new TreeNode(1);
        case3Node1.left = case3Node2;
        case3Node1.right = case3Node3;
        case3Node2.left = case3Node4;
        case3Node3.left = case3Node5;
        case3Node3.right = case3Node6;
        case3Node4.left = case3Node7;
        case3Node4.right = case3Node8;
        case3Node6.right = case3Node9;
        assertTrue(client.hasPathSum(case3Node1, 22));
    }
}