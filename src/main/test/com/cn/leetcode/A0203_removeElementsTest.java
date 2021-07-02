package com.cn.leetcode;

import com.cn.leetcode.internal.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0203_removeElementsTest {

    private A0203_removeElements client;

    @Before
    public void setUp() throws Exception {
        client = new A0203_removeElements();
    }

    @Test
    public void removeElements() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        ListNode head = client.removeElements(node1, 6);
        assertEquals(1, head.val);
        assertEquals(2, head.next.val);
        assertEquals(3, head.next.next.val);
        assertEquals(4, head.next.next.next.val);
        assertEquals(5, head.next.next.next.next.val);
        assertNull(head.next.next.next.next.next);

        assertNull(client.removeElements(null, 1));

        assertNull(client.removeElements(new ListNode(7, new ListNode(7)), 7));
    }
}