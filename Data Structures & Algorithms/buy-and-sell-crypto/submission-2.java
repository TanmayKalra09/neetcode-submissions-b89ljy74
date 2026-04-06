class Solution {
    public int maxProfit(int[] prices) {
        int pro=0;
        int low=prices[0];
        for(int i=1;i<prices.length;i++){
            if(low>prices[i]){
                low = prices[i];
            }
            else{
                pro=Math.max(prices[i]-low,pro);
            }
        }
        return pro;
    }
}
