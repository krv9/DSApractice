package com.task2.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void bfs(int start, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls) {
        Queue<Integer> queue = new LinkedList<>(); 
        queue.add(start); 
        vis[start] = true; 

        while (!queue.isEmpty()) {
            int node = queue.poll(); 
            ls.add(node); 

            for (Integer it : adj.get(node)) {
                if (!vis[it]) { 
                    queue.add(it); 
                    vis[it] = true; 
                }
            }
        }
    }

    public ArrayList<Integer> bfsofg(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[v]; 
        ArrayList<Integer> ls = new ArrayList<>();

        bfs(0, vis, adj, ls);

        return ls;
    }

    public static void main(String[] args) {
        int v=6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(5);
        adj.get(2).add(1);
        adj.get(3).add(4);
        adj.get(4).add(2);

        BFS bfsObject = new BFS();
        ArrayList<Integer> result = bfsObject.bfsofg(v, adj);

        System.out.println("BFS Traversal: " + result);
    }
}
