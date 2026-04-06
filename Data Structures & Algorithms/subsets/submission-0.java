class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backtrack(nums,ans,0,res);
        return res;
        
    }
    public void backtrack(int[] nums, List<Integer> ans, int i,List<List<Integer>> res){
        if(i>=nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        backtrack(nums,ans,i+1,res);
        ans.remove(ans.size()-1);
        backtrack(nums,ans,i+1,res);
    }
}
