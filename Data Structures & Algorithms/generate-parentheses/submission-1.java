class Solution {
    List<String> list = new ArrayList<>();
    public void backtrack(int n,int o,int c,String s){
        if(o==n && c==n){
            list.add(new String(s));
        }
        if(o<n){
            backtrack(n,o+1,c,s+"(");
        }
        if(c<o){
            backtrack(n,o,c+1,s+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        backtrack(n,0,0,"");
        return list;
    }
}
