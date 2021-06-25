package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A0110_minDepthTest {

    private A0110_minDepth client;

    @Before
    public void setUp() throws Exception {
        client = new A0110_minDepth();
    }

    @Test
    public void minDepth() {

        assertEquals(0, client.minDepth(null));
        assertEquals(1, client.minDepth(new TreeNode(1)));
        assertEquals(2, client.minDepth(new TreeNode(1, null, new TreeNode(2))));
        assertEquals(2, client.minDepth(new TreeNode(1, new TreeNode(2), null)));

        TreeNode case1Node1 = new TreeNode(3);
        TreeNode case1Node2 = new TreeNode(9);
        TreeNode case1Node3 = new TreeNode(20);
        TreeNode case1Node4 = new TreeNode(15);
        TreeNode case1Node5 = new TreeNode(7);
        case1Node1.left = case1Node2;
        case1Node1.right = case1Node3;
        case1Node3.left = case1Node4;
        case1Node3.right = case1Node5;
        assertEquals(2, client.minDepth(case1Node1));

        TreeNode case2Node1 = new TreeNode(2);
        TreeNode case2Node2 = new TreeNode(3);
        TreeNode case2Node3 = new TreeNode(4);
        TreeNode case2Node4 = new TreeNode(5);
        TreeNode case2Node5 = new TreeNode(6);
        case2Node1.right = case2Node2;
        case2Node2.right = case2Node3;
        case2Node3.right = case2Node4;
        case2Node4.right = case2Node5;
        assertEquals(5, client.minDepth(case2Node1));

    }
}