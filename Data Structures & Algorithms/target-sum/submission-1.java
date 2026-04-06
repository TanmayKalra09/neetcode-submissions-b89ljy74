class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<Integer,Integer> map1= new HashMap<>();
        map1.put(0,1);
        for(int num:nums){
            HashMap<Integer,Integer> map2= new HashMap<>();
            for(int sum: map1.keySet()){
                int count = map1.get(sum);
                map2.put(sum+num,map2.getOrDefault(sum+num,0)+count);
                map2.put(sum-num,map2.getOrDefault(sum-num,0)+count);
            }
            map1=map2;
        }
        return map1.getOrDefault(target,0);
        
    }
}
