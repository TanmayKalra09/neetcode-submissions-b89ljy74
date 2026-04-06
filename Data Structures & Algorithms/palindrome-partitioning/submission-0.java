class Solution {
    private List<String> ans = new ArrayList<>();
    private List<List<String>> res= new ArrayList<>();
    public List<List<String>> partition(String s) {
        help(s,0);
        return res;
    }
    private void help(String s,int i){
        if(i>=s.length()){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int j=i;j<s.length();j++){
            if(pali(s,i,j)){
                ans.add(s.substring(i,j+1));
                help(s,j+1);
                ans.remove(ans.size()-1);
            }
        }
    }
    private boolean pali(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
