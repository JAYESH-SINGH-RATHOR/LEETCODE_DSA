class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[numCourses];
        boolean pathVisited[] = new boolean[numCourses];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : prerequisites){
            int u = e[0];
            int v = e[1];
            adj.get(v).add(u);
        }
        for(int i = 0; i < numCourses; i++){
            if(!visited[i]){
                if(findOrderUtil(adj, i, visited, pathVisited, s)){
                    return new int[0];
                }
            }
        }
        int res[] = new int[numCourses];
        int idx = 0;
        while(!s.isEmpty()){
                res[idx++] = s.pop();
        }
        return res;
    }
    boolean findOrderUtil( ArrayList<ArrayList<Integer>> adj , int curr , boolean visited [], boolean pathVisited[] , Stack<Integer> s){
        visited[curr] = true;
        pathVisited[curr] = true;
        for(int e : adj.get(curr)){
            if(pathVisited[e]){
                return true;
            }
            if(!visited[e]){
                if(findOrderUtil(adj , e , visited , pathVisited , s)){
                    return true;
                }
            }
        }
        pathVisited[curr] = false;
        s.push(curr);
        return false;
    }
}