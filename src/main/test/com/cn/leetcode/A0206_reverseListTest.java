package com.cn.leetcode;

import com.cn.leetcode.internal.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0206_reverseListTest {

    private A0206_reverseList client;

    @Before
    public void setUp() throws Exception {
        client = new A0206_reverseList();
    }

    @Test
    public void reverseList() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode head = client.reverseList(node1);
        assertEquals(5, head.val);
        assertEquals(4, head.next.val);
        assertEquals(3, head.next.next.val);
        assertEquals(2, head.next.next.next.val);
        assertEquals(1, head.next.next.next.next.val);
    }
}