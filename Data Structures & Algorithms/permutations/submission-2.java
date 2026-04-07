class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public void backtrack(int[] nums,int i,boolean[] used,ArrayList<Integer> res){
        if(res.size()==nums.length){
            list.add(new ArrayList<>(res));
            return;
        }
        if(i>=nums.length){
            return;
        }
        if(!used[i]){
            used[i]=true;
            res.add(nums[i]);
            backtrack(nums,0,used,res);
            res.remove(res.size()-1);
            used[i]=false;
        }
        backtrack(nums,i+1,used,res);
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        ArrayList<Integer> res = new ArrayList<>();
        backtrack(nums,0,used,res);
        return list;
    }
}
