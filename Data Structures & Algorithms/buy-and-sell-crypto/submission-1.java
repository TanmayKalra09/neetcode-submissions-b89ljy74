class Solution {
    public int maxProfit(int[] prices) {
        int diff=0;
        int price=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                diff=Math.max(price,prices[j]-prices[i]);
                price=diff;
            }
        }
        return diff;

        
    }
}
