class Solution {
    private HashMap<String,Integer> map = new HashMap<>();
    public int lengthOfLIS(int[] nums) {  
        return helper(nums,-1,0,map);
    }
    private int helper(int[] nums,int p,int c,HashMap<String,Integer> map){
        int t=0;
        if(c==nums.length){
            return 0;
        }
        String key = p + "," + c;
        if(map.containsKey(key)){
            return map.get(key);
        }
        if(p==-1 || nums[c]>nums[p]){
            t=1+helper(nums,c,c+1,map);
        }
        int nt=helper(nums,p,c+1,map);
        int res = Math.max(t,nt);
        map.put(key,res);
        return res;
    }
}
