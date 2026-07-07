class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    fresh++;
                }
                if(grid[i][j]==2){
                    q.offer(new int[]{i, j});
                }
            }
        }
        return rec(grid,n,m,q,fresh);
    }
    public int rec(int grid[][],int n,int m , Queue<int[]> q,int fresh){
        int count=-1;
        if(fresh==0){
            return 0;
        }
        while(!q.isEmpty()){
            int size=q.size();
            while(size>0){
                int cell[]=q.poll();
                int i=cell[0];
                int j=cell[1];
                int ele = grid[i][j];
                if(i<n-1 && grid[i+1][j]==1){
                    grid[i+1][j]=2;
                    fresh--;
                    q.offer(new int[]{i+1, j});
                }
                if(i>0 && grid[i-1][j]==1){
                    grid[i-1][j]=2;
                    fresh--;
                    q.offer(new int[]{i-1, j});
                }
                if(j>0 && grid[i][j-1]==1){
                    grid[i][j-1]=2;
                    fresh--;
                    q.offer(new int[]{i, j-1});
                }
                if(j<m-1 && grid[i][j+1]==1){
                    grid[i][j+1]=2;
                    fresh--;
                    q.offer(new int[]{i, j+1});
                }size--;
            }
            count++;
        }
        return fresh==0 ? count : -1;
    }
}
