class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        int dist[] = new int[n + 1];
        Arrays.fill(dist , Integer.MAX_VALUE);
        dist[k] = 0;
        PriorityQueue<int[]> pq =
    new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        pq.add(new int[]{k , 0});
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : times){
            int u = e[0];
            int v = e[1];
            int wt = e[2];
            adj.get(u).add(new int[]{v , wt});
        }
       while(!pq.isEmpty()){
        int curr[] = pq.remove();
        int node = curr[0];
        int wt = curr[1];
        if(wt > dist[node]){
            continue;
        }
        for(int e[] : adj.get(node)){
           int next = e[0];
           int nextwt = e[1];
           if(dist[node] + nextwt < dist[next]){
            dist[next] = dist[node] + nextwt;
            pq.add(new int[]{next , dist[next]});
           }
        }
       }
       for(int i = 1; i <= n; i++){
        if(dist[i] == Integer.MAX_VALUE){
            return -1;
        }
        count = Math.max(dist[i] , count);
       }
       return count;
    }
}