package com.example;

import com.example.internal.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class A0110_isBalancedTest {

    private A0110_isBalanced client;

    @Before
    public void setUp() {
        client = new A0110_isBalanced();
    }

    @Test
    public void isBalanced() {
        TreeNode case1Node1 = new TreeNode(1);
        TreeNode case1Node2 = new TreeNode(2);
        case1Node1.left = case1Node2;
        case1Node2.left = new TreeNode(3);
        assertFalse(client.isBalanced(case1Node1));
        assertTrue(client.isBalanced(null));

        TreeNode case2Node1 = new TreeNode(1);
        TreeNode case2Node2 = new TreeNode(2);
        TreeNode case2Node3 = new TreeNode(3);
        case2Node1.left = case2Node2;
        case2Node1.right = case2Node3;
        case2Node3.right = new TreeNode(3);
        assertTrue(client.isBalanced(case2Node1));

        TreeNode case3Node1 = new TreeNode(3);
        TreeNode case3Node2 = new TreeNode(9);
        TreeNode case3Node3 = new TreeNode(20);
        TreeNode case3Node4 = new TreeNode(15);
        TreeNode case3Node5 = new TreeNode(7);
        case3Node1.left = case3Node2;
        case3Node1.right = case3Node3;
        case3Node1.left = case3Node4;
        case3Node1.right = case3Node5;
        assertTrue(client.isBalanced(case3Node1));

        TreeNode case4Node1 = new TreeNode(1);
        TreeNode case4Node2 = new TreeNode(2);
        TreeNode case4Node3 = new TreeNode(2);
        TreeNode case4Node4 = new TreeNode(3);
        TreeNode case4Node5 = new TreeNode(3);
        TreeNode case4Node6 = new TreeNode(4);
        TreeNode case4Node7 = new TreeNode(4);
        case4Node1.left = case4Node2;
        case4Node1.right = case4Node3;
        case4Node2.left = case4Node4;
        case4Node2.right = case4Node5;
        case4Node4.left = case4Node6;
        case4Node4.right = case4Node7;
        assertFalse(client.isBalanced(case4Node1));

        TreeNode case5Node1 = new TreeNode(1);
        TreeNode case5Node2 = new TreeNode(2);
        TreeNode case5Node3 = new TreeNode(3);
        TreeNode case5Node4 = new TreeNode(4);
        TreeNode case5Node5 = new TreeNode(5);
        TreeNode case5Node6 = new TreeNode(6);
        TreeNode case5Node7 = new TreeNode(8);
        case5Node1.left = case4Node2;
        case5Node1.right = case5Node3;
        case5Node2.left = case5Node4;
        case5Node2.right = case5Node5;
        case5Node3.left = case5Node6;
        case5Node4.left = case5Node7;
        assertTrue(client.isBalanced(case4Node1));
    }
}