class Solution {
    int R;
    int C;
    HashSet<Pair<Integer,Integer>> path;

    public boolean exist(char[][] board, String word) {
        R = board.length;
        C = board[0].length;
         path = new HashSet<>();

        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(backtrack(board,word,r,c,0)){
                    return true;
                }
            }
        }
        return false;
        
    }
    public boolean backtrack(char[][] board, String word,int r,int c,int i){
        if(i==word.length()){
            return true;
        }

        if(r<0||c<0||r>=R||c>=C || board[r][c] != word.charAt(i) || path.contains(new Pair<>(r,c))){
            return false;
        }

        path.add(new Pair<>(r,c));
        boolean res =  backtrack(board, word, r + 1, c, i + 1) || 
                      backtrack(board, word, r - 1, c, i + 1) ||
                      backtrack(board, word, r, c + 1, i + 1) || 
                      backtrack(board, word, r, c - 1, i + 1);
                      path.remove(new Pair<>(r,c));

                      return res;
    }
}
