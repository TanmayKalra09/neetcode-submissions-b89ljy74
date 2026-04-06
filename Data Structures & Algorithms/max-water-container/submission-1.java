class Solution {
    public int maxArea(int[] heights) {
        int ans =0;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                ans=Math.max(ans,(Math.min(heights[i],heights[j]))*Math.abs(i-j));
            }
        }
        return ans;
        
    }
}
