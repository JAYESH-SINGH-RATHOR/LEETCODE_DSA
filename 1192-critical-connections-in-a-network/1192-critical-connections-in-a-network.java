class Solution {
    int timer = 1;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
    List<List<Integer>> adj = new ArrayList<>();
        int low[] = new int[n];
        int dist[] = new int[n];
        List<List<Integer>> bridge = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (List<Integer> e : connections) {
            int u = e.get(0);
            int v = e.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for (int i = 0; i < n; i++) {
            if (dist[i] == 0) {
                dfs(i, -1, adj, low, dist, bridge);
            }
        }
        return bridge;
    }
    public void dfs(int curr, int parent,
                    List<List<Integer>> adj,
                    int low[], int dist[],
                    List<List<Integer>> bridge) {

        low[curr] = dist[curr] = timer++;
        for (int e : adj.get(curr)) {
            if (e == parent) {
                continue;
            }
            if (dist[e] == 0) {
                dfs(e, curr, adj, low, dist, bridge);
                low[curr] = Math.min(low[curr], low[e]);
                if (low[e] > dist[curr]) {
                    bridge.add(Arrays.asList(curr, e));
                }
            } else {
                low[curr] = Math.min(low[curr], dist[e]);
            }
        }
    }
}
