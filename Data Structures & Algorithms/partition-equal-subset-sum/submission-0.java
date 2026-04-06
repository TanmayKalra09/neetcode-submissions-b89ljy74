class Solution {
    private HashMap<String,Boolean> map = new HashMap<>();
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num : nums){
            sum=sum+num;
        }
        int target=sum/2;
        if(sum%2!=0){
            return false;
        }
        return help(nums,target,nums.length-1,map);
    }
    private static boolean help(int[] nums,int target,int i,HashMap<String,Boolean> map){
        if(target==0){
            return true;
        }
        if(i<0 || target<0){
            return false;
        }
        String key = i+","+target;
        if(map.containsKey(key)){
            return map.get(key);
        }
        boolean left = help(nums,target-nums[i],i-1,map);
        boolean right = help(nums,target,i-1,map);
        boolean res = left || right;
        map.put(key,res);
        return res;

    }
}
