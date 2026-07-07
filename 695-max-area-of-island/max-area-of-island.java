class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean visited[][]=new boolean[n][m];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0 
                        && !visited[i][j]){
                        ans=Math.max(rec(grid,i,j,n,m,visited),ans);
                }
            }
        }
        return ans;
    }
    public int rec(int grid[][], int i,int j,int n, int m,boolean visited[][]){
        if(i<0 
            || j<0 
            || i>n-1 || j>m-1
            || visited[i][j]
            || grid[i][j]!=1)
        {
                return 0;
        }
        if(visited[i][j]){
            return 0;
        }
        visited[i][j]=true;
        
        return 
        1+rec(grid,i+1,j,n,m,visited)
        + rec(grid,i-1,j,n,m,visited)
        + rec(grid,i,j-1,n,m,visited)
        + rec(grid,i,j+1,n,m,visited);
        
    }
}
