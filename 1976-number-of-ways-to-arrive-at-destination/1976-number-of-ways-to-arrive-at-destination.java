class Solution {
    public int countPaths(int n, int[][] roads) {
        int ways[] = new int[n];
        long dist[] = new long[n];  
        int MOD = 1_000_000_007;
        Arrays.fill(dist , Long.MAX_VALUE);
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        PriorityQueue<long[]> pq = new PriorityQueue<>((a  ,b) -> Long.compare(a[1] , b[1]));
        dist[0] = 0;
        ways[0]  = 1;
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int x[] : roads){
            int u = x[0];
            int v  = x[1];
            int wt = x[2];
            adj.get(u).add(new int[]{v , wt});
            adj.get(v).add(new int[]{u , wt});
        }
            pq.add(new long[]{0 , 0});
            while(!pq.isEmpty()){
            long curr[] = pq.remove();
            int node = (int) curr[0];
            long wtt = curr[1];
                if(wtt > dist[node]){
                    continue;
                }
                for(int e[] : adj.get(node)){
                    int next = e[0];
                     long nwt = e[1];
                    if(dist[node] + nwt < dist[next]){
                        dist[next] = dist[node] + nwt;
                        ways[next] = ways[node];
                       pq.add(new long[]{next, dist[next]});
                    }
                    else if(dist[node] + nwt == dist[next]){
                       ways[next] = (int) (
                        ((long) ways[next] + ways[node]) % MOD);
                    }
                }
            }
        
        return ways[n - 1];
    }
}

