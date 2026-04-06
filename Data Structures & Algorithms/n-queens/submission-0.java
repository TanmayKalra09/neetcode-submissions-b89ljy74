class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res= new ArrayList<>();
        char[][] board = new char[n][n];   
        help(0,board,res);
        return res;
    }
    private boolean safe(char[][] board,int row,int col){
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        int r=row;
        int c=col;
        for(c=col;c<board.length && r<board.length;c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        for(r=row,c=col;r<board.length && c>=0;r++,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        for(r=row,c=col;r>=0 && c>=0;r--,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        for(r=row,c=col;r>=0 && c<board.length;r--,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;

    }
    private void help(int col,char[][] board,List<List<String>> res){
        if(col==board.length){
            saveBoard(board,res);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(safe(board,row,col)){
                board[row][col]='Q';
                help(col+1,board,res);
                board[row][col]='.';
            }
        }

    }
    private void saveBoard(char[][] board,List<List<String>> res){
        String row="";
        List<String> newBoard = new ArrayList<>();
            for(int i=0;i<board.length;i++){
                row="";
                for(int j=0;j<board.length;j++){
                    if(board[i][j]=='Q'){
                        row=row+'Q';
                    }
                    else{
                        row=row+".";
                    }
                }
                newBoard.add(row);
            }
            res.add(newBoard);
        }

}
