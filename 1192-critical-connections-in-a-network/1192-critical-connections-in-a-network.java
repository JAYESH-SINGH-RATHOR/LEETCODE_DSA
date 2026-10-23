class Solution {
    int timer = 1;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        int low[] = new int[n];
        int dist[] = new int[n];
        boolean visited[] = new boolean[n];
        List<List<Integer>> adj = new ArrayList<>();
        List<List<Integer>> bridge = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(List<Integer> e  : connections){
            int u = e.get(0);
            int v = e.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(i , -1 , adj , low , dist , bridge , visited);
            }
        }
        return bridge;
    }
    void dfs(int curr , int parent , List<List<Integer>> adj , int low[] , int dist[] , List<List<Integer>> bridge , boolean visited[]){
        visited[curr] = true;
        low[curr] = dist[curr] = timer++;
        for(int e : adj.get(curr)){
            if(e == parent){
                continue;
            }
            if(!visited[e]){
                dfs(e ,curr , adj , low , dist , bridge , visited);
                low[curr] = Math.min(low[curr] , low[e]);
                if(low[e] > dist[curr]){
                    bridge.add(Arrays.asList(curr , e));
                }
            }
            else{
              low[curr] = Math.min(low[curr] , dist[e]);
        }
        }
    }
}