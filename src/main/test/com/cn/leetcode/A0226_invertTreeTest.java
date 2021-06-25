package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0226_invertTreeTest {

    private A0226_invertTree client;

    @Before
    public void setUp() throws Exception {
        client = new A0226_invertTree();
    }

    @Test
    public void invertTree() {

        TreeNode case1Node1 = new TreeNode(4);
        TreeNode case1Node2 = new TreeNode(2);
        TreeNode case1Node3 = new TreeNode(7);
        TreeNode case1Node4 = new TreeNode(1);
        TreeNode case1Node5 = new TreeNode(3);
        TreeNode case1Node6 = new TreeNode(6);
        TreeNode case1Node7 = new TreeNode(9);
        case1Node1.left = case1Node2;
        case1Node1.right = case1Node3;
        case1Node2.left = case1Node4;
        case1Node2.right = case1Node5;
        case1Node3.left = case1Node6;
        case1Node3.right = case1Node7;

        TreeNode caseInvert1 = client.invertTree(case1Node1);
        assertEquals(4, caseInvert1.val);
        assertEquals(7, caseInvert1.left.val);
        assertEquals(2, caseInvert1.right.val);
        assertEquals(9, caseInvert1.left.left.val);
        assertEquals(6, caseInvert1.left.right.val);
        assertEquals(3, caseInvert1.right.left.val);
        assertEquals(1, caseInvert1.right.right.val);
    }
}