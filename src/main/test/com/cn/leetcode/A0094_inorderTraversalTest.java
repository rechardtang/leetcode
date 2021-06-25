package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class A0094_inorderTraversalTest {
    private A0094_inorderTraversal client;

    @Before
    public void setUp() {
        client = new A0094_inorderTraversal();
    }

    @Test
    public void inorderTraversal() {
        TreeNode case1Node1 = new TreeNode(1);
        TreeNode case1Node2 = new TreeNode(2);
        TreeNode case1Node3 = new TreeNode(3);
        case1Node1.right = case1Node2;
        case1Node2.left = case1Node3;

        assertEquals(Arrays.asList(1, 3, 2), client.inorderTraversal(case1Node1));
        assertEquals(Collections.emptyList(), client.inorderTraversal(null));
        assertEquals(Collections.singletonList(1), client.inorderTraversal(new TreeNode(1)));

        TreeNode case2Node1 = new TreeNode(1);
        case2Node1.left = new TreeNode(2);
        assertEquals(Arrays.asList(2, 1), client.inorderTraversal(case2Node1));

        TreeNode case3Node1 = new TreeNode(1);
        case3Node1.right = new TreeNode(2);
        assertEquals(Arrays.asList(1, 2), client.inorderTraversal(case3Node1));
    }

    @Test
    public void inorderTraversalDFS() {
        TreeNode case1Node1 = new TreeNode(1);
        TreeNode case1Node2 = new TreeNode(2);
        TreeNode case1Node3 = new TreeNode(3);
        case1Node1.right = case1Node2;
        case1Node2.left = case1Node3;

        assertEquals(Arrays.asList(1, 3, 2), client.inorderTraversalDFS(case1Node1));
        assertEquals(Collections.emptyList(), client.inorderTraversalDFS(null));
        assertEquals(Collections.singletonList(1), client.inorderTraversalDFS(new TreeNode(1)));

        TreeNode case2Node1 = new TreeNode(1);
        case2Node1.left = new TreeNode(2);
        assertEquals(Arrays.asList(2, 1), client.inorderTraversalDFS(case2Node1));

        TreeNode case3Node1 = new TreeNode(1);
        case3Node1.right = new TreeNode(2);
        assertEquals(Arrays.asList(1, 2), client.inorderTraversalDFS(case3Node1));

        TreeNode case4Node1 = new TreeNode(2);
        TreeNode case4Node2 = new TreeNode(3);
        case4Node1.left = case4Node2;
        case4Node2.left = new TreeNode(1);
        assertEquals(Arrays.asList(1, 3, 2), client.inorderTraversalDFS(case4Node1));

    }
}