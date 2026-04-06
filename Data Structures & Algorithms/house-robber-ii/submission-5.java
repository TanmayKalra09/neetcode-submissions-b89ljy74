class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        HashMap<Integer,Integer> map1 = new HashMap<>();
        int f=loot(nums,0,nums.length-2,map1);
        HashMap<Integer,Integer> map2=new HashMap<>();
        int s=loot(nums,1,nums.length-1,map2);
        return Math.max(s,f);
    }
    private static int loot(int[] nums,int s,int e,HashMap<Integer,Integer> map){
        if(s>e){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(map.containsKey(s)){
            return map.get(s);
        }
        int left=nums[s]+loot(nums,s+2,e,map);
        int right=loot(nums,s+1,e,map);
        int res=Math.max(left,right);
        map.put(s,res);
        return res;
    }

}
