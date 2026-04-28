class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] row=new HashSet[9];
        Set<Character>[] col=new HashSet[9];
        Set<Character>[] brd=new HashSet[9];

        for(int i=0;i<9;i++){
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
            brd[i]=new HashSet<>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                int boardIndex=(i/3)*3+(j/3);
                char key=board[i][j];

                if(row[i].contains(key) ||
                    col[j].contains(key) ||
                    brd[boardIndex].contains(key)){
                        return false;
                }
                row[i].add(key);
                col[j].add(key);
                brd[boardIndex].add(key);
            }
        }
        return true;
    }
}