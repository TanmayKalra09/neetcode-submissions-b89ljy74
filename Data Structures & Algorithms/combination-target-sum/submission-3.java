class Solution {
    List<List<Integer>> arr = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> res = new ArrayList<>();
        back(nums,target,res,0);
        return arr;
        
    }
    private void back(int[] nums,int target,List<Integer> res,int i){
        if(target==0){
            arr.add(new ArrayList(res));
            return;
        }
        if(target<0 || i>=nums.length){
            return;
        }
        res.add(nums[i]);
        back(nums,target-nums[i],res,i);
        res.remove(res.size()-1);
        back(nums,target,res,i+1);

    }
}
