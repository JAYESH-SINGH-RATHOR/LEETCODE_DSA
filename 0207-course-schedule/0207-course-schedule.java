class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean visited[] = new boolean[numCourses];
        boolean pathVisited[] = new boolean[numCourses];
        Stack<Integer> s = new Stack<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : prerequisites){
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
        }
        for(int i = 0; i < numCourses; i++){
            if(!visited[i]){
                if(canFinishUtil(adj , i , visited , pathVisited)){
                    return false;
                }
            }
        }
        return true;
    }
    boolean canFinishUtil(ArrayList<ArrayList<Integer>>adj , int curr , boolean visited[] , boolean pathVisited[]){
        visited[curr] = true;
        pathVisited[curr] = true;
        for(int e : adj.get(curr)){
            if(pathVisited[e]){
                return true;
            }
            if(!visited[e]){
                if(canFinishUtil(adj , e , visited , pathVisited)){
                    return true;
                }
            }
        }
        pathVisited[curr] = false;
        return false;
     }
}