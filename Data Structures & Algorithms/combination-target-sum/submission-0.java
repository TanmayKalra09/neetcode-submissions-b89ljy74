class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> abc = new ArrayList<>();
        backtrack(nums,target,abc,0,res);
        return res;  
    }

    public void backtrack(int[] nums, int target,List<Integer> abc,int i,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList(abc));
            return;
        }
        if(target<0 || i>=nums.length){
            return;
        }
        abc.add(nums[i]);
        backtrack(nums,target-nums[i],abc,i,res);
        abc.remove(abc.size()-1);
        backtrack(nums,target,abc,i+1,res);

    
    }
}
