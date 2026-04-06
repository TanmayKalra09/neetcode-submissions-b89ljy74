class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<List<Integer>>();
        List<Integer> ans = new ArrayList<>();
        backtrack(nums,target,ans,0);
        return res;
        
        
    }

    public void backtrack(int[] nums, int target, List<Integer> ans, int i){
        if(target == 0){
            res.add(new ArrayList(ans));
            return;
        }
        if(target < 0 || i>=nums.length){
            return;
        }
        ans.add(nums[i]);
        backtrack(nums,target-nums[i],ans,i);
        ans.remove(ans.size() -1);
        backtrack(nums, target,ans,i+1);
    }
}
