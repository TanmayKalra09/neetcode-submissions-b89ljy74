class Solution {
    private HashMap<Integer,Integer> map = new HashMap<>();
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(help(cost,0,map),help(cost,1,map));
        
    }
    private int help(int[] cost,int i,HashMap<Integer,Integer> map){
        if(i>=cost.length){
            return 0;
        }
        if(map.containsKey(i)){
            return map.get(i);
        }
        int left=cost[i]+help(cost,i+1,map);
        int right=cost[i]+help(cost,i+2,map);
        int res=Math.min(left,right);
        map.put(i,res);
        return res;
    }
}
