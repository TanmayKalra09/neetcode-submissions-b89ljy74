class Solution {
    public int rob(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        return rob(nums,nums.length-1,map);
        
    }
    private static int rob(int[] nums,int n,HashMap<Integer,Integer> map){
        if(n<0){
            return 0;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int left=nums[n] + rob(nums,n-2,map);
        int right=rob(nums,n-1,map);
        int res= Math.max(left,right);
        map.put(n,res);
        return res;
    }

}
