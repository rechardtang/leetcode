package com.example;

import com.example.internal.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class A0145_postorderTraversalTest {

    private A0145_postorderTraversal client;

    @Before
    public void setUp() {
        client = new A0145_postorderTraversal();
    }

    @Test
    public void postorderTraversal() {
        TreeNode case1Node1 = new TreeNode(1);
        TreeNode case1Node2 = new TreeNode(2);
        TreeNode case1Node3 = new TreeNode(3);
        case1Node1.right = case1Node2;
        case1Node2.left = case1Node3;

        assertEquals(Arrays.asList(3, 2, 1), client.postorderTraversal(case1Node1));

        assertEquals(Collections.emptyList(), client.postorderTraversal(null));

        TreeNode case2Node1 = new TreeNode(1);
        assertEquals(Collections.singletonList(1), client.postorderTraversal(case2Node1));

        TreeNode case3Node1 = new TreeNode(1);
        TreeNode case3Node2 = new TreeNode(2);
        case3Node1.left = case3Node2;
        assertEquals(Arrays.asList(2, 1), client.postorderTraversal(case3Node1));

        TreeNode case4Node1 = new TreeNode(1);
        TreeNode case4Node2 = new TreeNode(2);
        case4Node1.right = case4Node2;
        assertEquals(Arrays.asList(2, 1), client.postorderTraversal(case4Node1));
    }
}