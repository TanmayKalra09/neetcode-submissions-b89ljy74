class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int mins=1;
        int maxs=0;
        for(int pile: piles){
            maxs=Math.max(maxs,pile);
        }
        while(mins<maxs){
            int mid = mins + (maxs-mins)/2;
            if(eat(piles,h,mid)){
                maxs=mid;
            }
            else{
                mins=mid+1;
            }
        }
        return mins;
        
    }
    private boolean eat(int[] piles,int h,int s){
        int t=0;
        for(int pile:piles){
            t = t + (int)Math.ceil((double)pile/s);
        }
        return t<=h;
    }
}
