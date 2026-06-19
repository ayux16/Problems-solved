class Solution {
    public int numIslands(char[][] A) {
        int n=A.length;
        int m=A[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(A[i][j]=='1'){
                    dfs(A,i,j,n,m);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char a[][], int i,int j,int n,int m){
        a[i][j]=0;
        if(i-1>=0 && a[i-1][j]=='1'){
            dfs(a,i-1,j,n,m);
        }

        if(i+1<n && a[i+1][j]=='1'){
            dfs(a,i+1,j,n,m);
        }

        if(j-1>=0 && a[i][j-1]=='1'){
            dfs(a,i,j-1,n,m);
        }

        if(j+1<m && a[i][j+1]=='1'){
            dfs(a,i,j+1,n,m);
        }
        return;
    }
}