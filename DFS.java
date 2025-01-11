package com.task2.graph;

import java.util.ArrayList;

public class DFS {
    public static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls) {
        vis[node] = true;
        ls.add(node); 

       
        for (Integer it : adj.get(node)) {
            if (!vis[it]) { 
                dfs(it, vis, adj, ls); 
            }
        }
    }

    public ArrayList<Integer> dfsofg(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[v]; 
        ArrayList<Integer> ls = new ArrayList<>(); 

        dfs(0, vis, adj, ls);

        return ls; 
    }

    public static void main(String[] args) {
    	
        int v = 6; 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= v; i++) {
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

        DFS dfsObject = new DFS();
        ArrayList<Integer> result = dfsObject.dfsofg(v, adj);

        System.out.println("DFS Traversal: " + result);
    }
}
