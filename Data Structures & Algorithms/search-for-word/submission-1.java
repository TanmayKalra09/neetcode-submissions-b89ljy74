class Solution {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(check(board,words,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean check(char[][] board, char[] words, int i, int j, int k){
        if(k==words.length){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length){
            return false;
        }
        if(board[i][j]!=words[k]){
            return false;
        }
        boolean found =false;
        char temp = board[i][j];
        board[i][j]='#';
        if(check(board,words,i+1,j,k+1) || check(board,words,i-1,j,k+1)
        || check(board,words,i,j+1,k+1) || check(board,words,i,j-1,k+1)){
            found=true;
        }
        board[i][j]=temp;
        return found;
    }
}
