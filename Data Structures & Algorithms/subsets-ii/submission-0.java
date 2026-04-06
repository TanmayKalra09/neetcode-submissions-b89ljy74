class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        backtrack(nums,set,ans,0);
        return new ArrayList<>(set);
        
    }
    private void backtrack(int[] nums,HashSet<List<Integer>> set,List<Integer> ans,int start){
        set.add(new ArrayList<>(ans));

        for(int i = start;i<nums.length;i++){
            ans.add(nums[i]);
            backtrack(nums,set,ans,i+1);
            ans.remove(ans.size()-1);
        }
    }
}
