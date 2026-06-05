package Graphs;

import java.util.List;

public class DFS {
    public void dfs(int node, boolean[] vis, List<List<Integer>> adj) {

        vis[node] = true;

        for(int it : adj.get(node)) {
            if(!vis[it]) {
                dfs(it, vis, adj);
            }
        }
    }
}
