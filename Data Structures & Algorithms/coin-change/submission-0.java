class Solution {
    private HashMap<String,Integer> map = new HashMap<>();
    public int coinChange(int[] coins, int amount) {
        int result = help(coins, amount, coins.length - 1,map);
        return (result == Integer.MAX_VALUE) ? -1 : result;
    }
    private static int help(int[] coins, int amount,int i,HashMap<String,Integer> map){
        if(amount==0){
            return 0;
        }
        if (i < 0 || amount < 0) return Integer.MAX_VALUE; 
        String key = amount + "," + i;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int nt = help(coins,amount,i-1,map);
        int t=help(coins,amount-coins[i],i,map);
        if(amount>=coins[i] && t!=Integer.MAX_VALUE){
            t=1+t;
        }
        int res=Math.min(t,nt);
        map.put(key,res);
        return res;
        
    }
}
