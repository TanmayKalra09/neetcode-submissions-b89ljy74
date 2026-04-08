class Solution {
    List<List<String>> list = new ArrayList<>();
    public void backtrack(String s, int i, ArrayList<String> res){
        if(i==s.length()){
            list.add(new ArrayList(res));
            return;
        }
        for(int j=i;j<s.length();j++){
            if(pali(s,i,j)){
                res.add(s.substring(i,j+1));
                backtrack(s,j+1,res);
                res.remove(res.size()-1);
            }
        }
    }
    public boolean pali(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        ArrayList<String> res = new ArrayList<>();
        backtrack(s,0,res);
        return list;
    }
}
