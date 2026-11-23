class Solution {
    public int findCenter(int[][] edges) {
       int n = edges.length + 1;
       boolean visited[] = new boolean[n + 1];
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
       for(int i = 0; i <= n; i++){
        adj.add(new ArrayList<>());
       }
       for(int e[] : edges){
        int u = e[0];
        int v = e[1];
        adj.get(u).add(v);
        adj.get(v).add(u);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                q.add(i);
                while(!q.isEmpty()){
                    int curr = q.remove();
                    int countneighbour = 0;
                    for(int e : adj.get(curr)){
                        countneighbour++;
                        if(!visited[e]){
                            visited[e] = true;
                            q.add(e);
                        }
                    }
                    if(countneighbour > 1){
                        return curr;
                    }
                }
            }
        }
        return -1;
    }
}