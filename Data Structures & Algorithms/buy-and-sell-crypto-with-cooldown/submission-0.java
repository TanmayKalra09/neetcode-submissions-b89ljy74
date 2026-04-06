class Solution {
    public int maxProfit(int[] prices) {
        return help(prices,0,true);
        
    }
    private int help(int[] prices,int i, boolean buying){
        if(i>=prices.length){
            return 0;
        }
        int cooldown=help(prices,i+1,buying);
        if(buying){
            int buy=help(prices,i+1,false)-prices[i];
            return Math.max(cooldown,buy);
        }
        else{
            int sell=help(prices,i+2,true)+prices[i];
            return Math.max(cooldown,sell);
        }
    }
}
