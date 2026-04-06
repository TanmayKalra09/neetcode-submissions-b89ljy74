class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backtrack(nums,ans,list);
        return list;
        
    }
    private void backtrack(int[] nums,List<Integer> ans,List<List<Integer>> list){
        if(ans.size()==nums.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int num: nums){
            if(ans.contains(num)){
                continue;
            }
            ans.add(num);
            backtrack(nums,ans,list);
            ans.remove(ans.size()-1);
        }
    }
}
