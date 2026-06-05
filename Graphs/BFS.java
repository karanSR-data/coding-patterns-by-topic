package Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public void bfs(int V, List<List<Integer>> adj) {

        boolean[] vis = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()) {

            int node = q.poll();
            System.out.print(node + " ");

            for(int it : adj.get(node)) {
                if(!vis[it]) {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
    }
}
