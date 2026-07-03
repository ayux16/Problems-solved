class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean visited[][]=new boolean[n][m];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0) && check(board,word,i,j,0,visited) ){
                    return true;
                }
            }
        }
        return false;
    }
public boolean check(char[][] board, String word,int i,int j,int k,boolean visited[][]){
        
        if(i<0 || j<0 
            || i>board.length-1 
            || j>board[0].length-1 
            || board[i][j]!=word.charAt(k) 
            || visited[i][j]
        ){
            return false;
        }
        if(k==word.length()-1){
           return true;
        }
        visited[i][j]=true;
        if(check(board,word,i-1,j,k+1,visited) || //up
           check(board,word,i,j-1,k+1,visited) || //down
           check(board,word,i+1,j,k+1,visited) || //left
           check(board,word,i,j+1,k+1,visited))
        {
            return true;
        } //right
        visited[i][j]=false;
        return false;
    }
}