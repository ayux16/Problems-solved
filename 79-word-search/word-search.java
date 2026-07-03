class Solution {
    boolean flag=false;
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean visited[][]=new boolean[n][m];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]!=word.charAt(0)){
                    continue;
                }
                else{
                    check(board,word,i,j,0,visited);
                }
            }
        }
        return flag;
    }
public void check(char[][] board, String word,int i,int j,int k,boolean visited[][]){
        
        if(i<0 || j<0 || i>board.length-1 || j>board[0].length-1){
            return ;
        }
        if(board[i][j]!=word.charAt(k)){
            return;
        } 
        if(visited[i][j]){
            return;
        }
        if(k==word.length()-1){
            flag=true;
            return;
        }
        visited[i][j]=true;
        check(board,word,i-1,j,k+1,visited); //up
        check(board,word,i,j-1,k+1,visited); //down
        check(board,word,i+1,j,k+1,visited); //left
        check(board,word,i,j+1,k+1,visited); //right
        visited[i][j]=false;
    }
}