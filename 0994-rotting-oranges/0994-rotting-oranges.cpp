class Solution {
public:
    int orangesRotting(vector<vector<int>>& grid) {
        int Oranges=0;
        queue<pair<int,int>> q;
        int m=grid.size();
        int n=grid[0].size();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==2){
                    q.push({i,j});
                }
                else if(grid[i][j]==1){
                    Oranges++;
                }
            }
        }
        if(Oranges==0) return 0;

        int time=-1;
        int cnt=0;
        int dr[]={0,-1,0,1};
        int dc[]={-1,0,1,0};

        while(!q.empty()){
            int k=q.size();
            for(int i=0; i<k; i++){
                auto [x,y]=q.front();
                q.pop();

                for(int i=0; i<4; i++){
                    int nx=x+dr[i];
                    int ny=y+dc[i];

                    if(nx>=0 && ny>=0 && nx<m && ny<n && grid[nx][ny]==1){
                        grid[nx][ny]=2;
                        q.push({nx,ny});
                        cnt++;
                    }
                }
            }
            time++;
        }
        if(Oranges==cnt) return time;
        else return -1;
    }
};