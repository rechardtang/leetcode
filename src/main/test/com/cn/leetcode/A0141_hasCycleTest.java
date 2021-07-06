package com.cn.leetcode;

import com.cn.leetcode.internal.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0141_hasCycleTest {

    private A0141_hasCycle client;

    @Before
    public void setUp() throws Exception {
        client = new A0141_hasCycle();
    }

    @Test
    public void hasCycle() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node2;
        assertTrue(client.hasCycle(node1));
    }
}