class Solution {
    HashSet<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new HashSet<>();
        Arrays.sort(candidates);
        List<Integer> ans = new ArrayList<>();
        backtrack(candidates,target,0,ans,0);
        return new ArrayList<>(res);
        
    }
    public void backtrack(int[] candidates, int target,int i,List<Integer> ans,int total){
        if(total == target){
            res.add(new ArrayList<>(ans));
            return;
        }
        if(i>=candidates.length || total > target){
            return;
        }

        ans.add(candidates[i]);
        backtrack(candidates,target,i+1,ans,total+candidates[i]);
        ans.remove(ans.size()-1);
        backtrack(candidates,target,i+1,ans,total);
    }
}
