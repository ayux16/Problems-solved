public class Solution {
    int dp[][];
    public int minPathSum(int A[][]){
        int n=A.length;
        int m=A[0].length;
        dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        return ways(A,n-1,m-1);
    }
    public int ways(int A[][],int i,int j){
        if(i<0 || j<0){
            return Integer.MAX_VALUE;
        }
        if(i==0 && j==0){
            return A[0][0];
        }
        if(dp[i][j]==Integer.MAX_VALUE){
            dp[i][j]=Math.min(ways(A,i-1,j),ways(A,i,j-1))+A[i][j];
        }
        return dp[i][j];
    }
}