package org.geeksforgeeks.internal;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    public int v;
    public List<List<Integer>> adjList;

    public Graph(int v) {
        this.v = v;
        adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
    }

}
