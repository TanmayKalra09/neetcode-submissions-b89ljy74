class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        help(nums,res,list);
        return list;
        
    }
    private void help(int[] nums,List<Integer> res,List<List<Integer>> list ){
        if(nums.length==res.size()){
            list.add(new ArrayList(res));
        }
        for(int num:nums){
            if(res.contains(num)){
                continue;
            }
        
        res.add(num);
        help(nums,res,list);
        res.remove(res.size()-1);
        }
    }
}
