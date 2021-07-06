package com.cn.leetcode;

import com.cn.leetcode.internal.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0142_detectCycleTest {

    private A0142_detectCycle client;

    @Before
    public void setUp() throws Exception {
        client = new A0142_detectCycle();
    }

    @Test
    public void detectCycle() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;
        assertEquals(3, client.detectCycle(node1).val);
    }
}