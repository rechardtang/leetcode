package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class A0144_preorderTraversalTest {

    private A0144_preorderTraversal client;

    @Before
    public void setUp() {
        client = new A0144_preorderTraversal();
    }

    @Test
    public void preorderTraversal() {
        TreeNode case1Node1 = new TreeNode(1);
        TreeNode case1Node2 = new TreeNode(2);
        TreeNode case1Node3 = new TreeNode(3);
        case1Node1.right = case1Node2;
        case1Node2.left = case1Node3;

        assertEquals(Arrays.asList(1, 2, 3), client.preorderTraversal(case1Node1));
        assertEquals(Collections.emptyList(), client.preorderTraversal(null));
        assertEquals(Collections.singletonList(1), client.preorderTraversal(new TreeNode(1)));

        TreeNode case2Node1 = new TreeNode(1);
        case2Node1.left = new TreeNode(2);
        assertEquals(Arrays.asList(1, 2), client.preorderTraversal(case2Node1));

        TreeNode case3Node1 = new TreeNode(1);
        case3Node1.right = new TreeNode(2);
        assertEquals(Arrays.asList(1, 2), client.preorderTraversal(case3Node1));
    }

    @Test
    public void preorderTraversalDFS() {
        TreeNode case1Node1 = new TreeNode(1);
        TreeNode case1Node2 = new TreeNode(2);
        TreeNode case1Node3 = new TreeNode(3);
        case1Node1.right = case1Node2;
        case1Node2.left = case1Node3;

        assertEquals(Arrays.asList(1, 2, 3), client.preorderTraversalDFS(case1Node1));
        assertEquals(Collections.emptyList(), client.preorderTraversalDFS(null));
        assertEquals(Collections.singletonList(1), client.preorderTraversalDFS(new TreeNode(1)));

        TreeNode case2Node1 = new TreeNode(1);
        case2Node1.left = new TreeNode(2);
        assertEquals(Arrays.asList(1, 2), client.preorderTraversalDFS(case2Node1));

        TreeNode case3Node1 = new TreeNode(1);
        case3Node1.right = new TreeNode(2);
        assertEquals(Arrays.asList(1, 2), client.preorderTraversalDFS(case3Node1));
    }
}