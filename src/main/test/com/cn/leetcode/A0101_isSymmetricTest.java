package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0101_isSymmetricTest {
    private A0101_isSymmetric client;

    @Before
    public void setUp() {
        client = new A0101_isSymmetric();
    }

    @Test
    public void isSymmetric() {
        TreeNode case1Node1 = new TreeNode(1);
        TreeNode case1Node2 = new TreeNode(2);
        TreeNode case1Node3 = new TreeNode(2);
        TreeNode case1Node4 = new TreeNode(3);
        TreeNode case1Node5 = new TreeNode(4);
        TreeNode case1Node6 = new TreeNode(4);
        TreeNode case1Node7 = new TreeNode(3);
        case1Node1.left = case1Node2;
        case1Node1.right = case1Node3;
        case1Node2.left = case1Node4;
        case1Node2.right = case1Node5;
        case1Node3.left = case1Node6;
        case1Node3.right = case1Node7;
        assertTrue(client.isSymmetric(case1Node1));

        TreeNode case2Node1 = new TreeNode(1);
        TreeNode case2Node2 = new TreeNode(2);
        TreeNode case2Node3 = new TreeNode(2);
        TreeNode case2Node4 = new TreeNode(3);
        TreeNode case2Node5 = new TreeNode(3);
        case2Node1.left = case2Node2;
        case2Node1.right = case2Node3;
        case2Node2.right = case2Node4;
        case2Node3.right = case2Node5;
        assertFalse(client.isSymmetric(case2Node1));

        TreeNode case3Node1 = new TreeNode(1);
        TreeNode case3Node2 = new TreeNode(2);
        TreeNode case3Node3 = new TreeNode(2);
        TreeNode case3Node4 = new TreeNode(2);
        TreeNode case3Node5 = new TreeNode(2);
        case3Node1.left = case3Node2;
        case3Node1.right = case3Node3;
        case3Node2.left = case3Node4;
        case3Node3.left = case3Node5;
        assertFalse(client.isSymmetric(case3Node1));

        TreeNode case4Node1 = new TreeNode(1);
        TreeNode case4Node2 = new TreeNode(2);
        TreeNode case4Node3 = new TreeNode(3);
        case4Node1.left = case4Node2;
        case4Node1.right = case4Node3;
        assertFalse(client.isSymmetric(case4Node1));
    }
}