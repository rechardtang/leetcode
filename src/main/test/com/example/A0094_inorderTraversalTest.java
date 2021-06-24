package com.example;

import com.example.internal.TreeNode;
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
        assertEquals(Collections.singletonList(1), client.inorderTraversal( new TreeNode(1)));

        TreeNode case2Node1 = new TreeNode(1);
        case2Node1.left = new TreeNode(2);
        assertEquals(Arrays.asList(2, 1), client.inorderTraversal(case2Node1));

        TreeNode case3Node1 = new TreeNode(1);
        case3Node1.right = new TreeNode(2);
        assertEquals(Arrays.asList(1, 2), client.inorderTraversal(case3Node1));
    }
}