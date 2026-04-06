class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        HashMap<Integer,Integer> map1 = new HashMap<>();
        int a=help(nums,0,nums.length-2,map1);
        HashMap<Integer,Integer> map2 = new HashMap<>();
        int b=help(nums,1,nums.length-1,map2);
        return Math.max(a,b);
    }
    private int help(int[] nums,int start,int end,HashMap<Integer,Integer> map){
        if(start>end){
            return 0;
        }
        if(map.containsKey(start)){
            return map.get(start);
        }
        int left=nums[start]+help(nums,start+2,end,map);
        int right=help(nums,start+1,end,map);
        int res=Math.max(left,right);
        map.put(start,res);
        return res;
    }
}
