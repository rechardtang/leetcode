package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0098_isValidBSTTest {

    private A0098_isValidBST client;

    @Before
    public void setUp() throws Exception {
        client = new A0098_isValidBST();
    }

    @Test
    public void isValidBST() {
        assertTrue(client.isValidBST(new TreeNode(1)));
        assertTrue(client.isValidBST(new TreeNode(2, new TreeNode(1), null)));
        assertFalse(client.isValidBST(new TreeNode(2, new TreeNode(3), null)));
        assertTrue(client.isValidBST(new TreeNode(2, null, new TreeNode(3))));
        assertFalse(client.isValidBST(new TreeNode(2, null, new TreeNode(1))));
        assertTrue(client.isValidBST(new TreeNode(2, new TreeNode(1), new TreeNode(3))));

        TreeNode case1Node1 = new TreeNode(5);
        TreeNode case1Node2 = new TreeNode(4);
        TreeNode case1Node3 = new TreeNode(6);
        TreeNode case1Node4 = new TreeNode(3);
        TreeNode case1Node5 = new TreeNode(7);
        case1Node1.left = case1Node2;
        case1Node1.right = case1Node3;
        case1Node3.left = case1Node4;
        case1Node3.right = case1Node5;
        assertFalse(client.isValidBST(case1Node1));
    }
}