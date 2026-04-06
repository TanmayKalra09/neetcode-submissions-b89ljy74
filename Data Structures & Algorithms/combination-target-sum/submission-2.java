class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backtrack(nums,target,0,ans,list);
        return list;
    }
    private void backtrack(int[] nums,int target,int i,List<Integer> ans,List<List<Integer>> list){
        if(target==0){
            list.add(new ArrayList<>(ans));
            return;
        }
        if(target<0){
            return;
        }
        for(int j=i;j<nums.length;j++){
            ans.add(nums[j]);
            backtrack(nums,target-nums[j],j,ans,list);
            ans.remove(ans.size()-1);
        }
    }
}
