class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean visited[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;
        while(!q.isEmpty()){
            int curr = q.remove();
            if(curr == destination){
                return true;
            }
            for(int e : adj.get(curr)){
                if(!visited[e]){
                    visited[e] = true;
                    q.add(e);
                }
            }
        }
        return false;
    }
}