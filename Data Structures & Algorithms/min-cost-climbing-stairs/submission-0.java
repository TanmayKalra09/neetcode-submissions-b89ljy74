class Solution {
    public int minCostClimbingStairs(int[] cost) {
        HashMap<Integer,Integer> map =new HashMap<>();
        return Math.min(climb(cost, 0, map), climb(cost, 1, map));
    }
    private static int climb(int[] cost,int i,HashMap<Integer,Integer> map){
        if(i>=cost.length){
            return 0;
        }
        if(map.containsKey(i)){
            return map.get(i);
        }
        int left = cost[i]+climb(cost,i+1,map);
        int right=Integer.MAX_VALUE;
        if(cost.length>2){
            right = cost[i]+climb(cost,i+2,map);
        }
        
        int res=Math.min(left,right);
        map.put(i,res);
        return res;
        
        
    }
}
