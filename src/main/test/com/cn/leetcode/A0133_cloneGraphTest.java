package com.cn.leetcode;

import com.cn.leetcode.internal.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0133_cloneGraphTest {

    private A0133_cloneGraph client;

    @Before
    public void setUp() throws Exception {
        client = new A0133_cloneGraph();
    }

    @Test
    public void cloneGraph() {
        assertNull(client.cloneGraph(null));

        Node node = client.cloneGraph(new Node(1));
        assertEquals(1, node.val);
        assertTrue(node.neighbors.isEmpty());

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.addNeighbor(node2);
        node1.addNeighbor(node4);
        node2.addNeighbor(node1);
        node2.addNeighbor(node3);
        node3.addNeighbor(node2);
        node3.addNeighbor(node4);
        node4.addNeighbor(node1);
        node4.addNeighbor(node3);
        Node copy = client.cloneGraph(node1);
        assertEquals(1, copy.val);
        // 1->2,4
        assertEquals(2, copy.neighbors.get(0).val);
        assertEquals(4, copy.neighbors.get(1).val);
        // 2->1,3
        assertEquals(1, copy.neighbors.get(0).neighbors.get(0).val);
        assertEquals(3, copy.neighbors.get(0).neighbors.get(1).val);
        // 3->2,4
        assertEquals(2, copy.neighbors.get(0).neighbors.get(1).neighbors.get(0).val);
        assertEquals(4, copy.neighbors.get(0).neighbors.get(1).neighbors.get(1).val);
        // 4->1,3
        assertEquals(1, copy.neighbors.get(1).neighbors.get(0).val);
        assertEquals(3, copy.neighbors.get(1).neighbors.get(1).val);
    }
}