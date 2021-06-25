package com.cn.leetcode;

import com.cn.leetcode.internal.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0019_removeNthFromEndTest {

    private A0019_removeNthFromEnd client;

    @Before
    public void setUp() throws Exception {
        client = new A0019_removeNthFromEnd();
    }

    @Test
    public void removeNthFromEnd() {
        assertNull(client.removeNthFromEnd(new ListNode(1), 1));
        assertEquals(1, client.removeNthFromEnd(new ListNode(1), 0).val);
        assertEquals(1, client.removeNthFromEnd(new ListNode(1, new ListNode(2)), 1).val);
        assertEquals(2, client.removeNthFromEnd(new ListNode(1, new ListNode(2)), 2).val);

        ListNode case1Node1 = new ListNode(1);
        ListNode case1Node2 = new ListNode(2);
        ListNode case1Node3 = new ListNode(3);
        ListNode case1Node4 = new ListNode(4);
        ListNode case1Node5 = new ListNode(5);
        case1Node1.next = case1Node2;
        case1Node2.next = case1Node3;
        case1Node3.next = case1Node4;
        case1Node4.next = case1Node5;
        ListNode case1Res = client.removeNthFromEnd(case1Node1, 2);
        assertEquals(1, case1Res.val);
        assertEquals(2, case1Res.next.val);
        assertEquals(3, case1Res.next.next.val);
        assertEquals(5, case1Res.next.next.next.val);
    }
}