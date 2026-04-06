class Solution {
    private HashMap<Integer,Integer> map = new HashMap<>();
    public int rob(int[] nums) {
        return help(nums,nums.length-1,map);
    }
    private int help(int[] nums,int i,HashMap<Integer,Integer> map){
        if(i<0){
            return 0;
        }
        if(map.containsKey(i)){
            return map.get(i);
        }
        int left=nums[i]+help(nums,i-2,map);
        int right=help(nums,i-1,map);
        int res=Math.max(left,right);
        map.put(i,res);
        return res;
    }
}
