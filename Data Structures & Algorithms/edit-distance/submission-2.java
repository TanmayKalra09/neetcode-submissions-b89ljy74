class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        
        dp[0][0]=0;
        for(int i=1;i<=word1.length();i++){
            dp[i][0]=i;
        }
        for(int j=1;j<=word2.length();j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=word1.length();i++){
            for(int j=1;j<=word2.length();j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    int top=dp[i-1][j];
                    int left=dp[i][j-1];
                    int top_left=dp[i-1][j-1];
                    dp[i][j]=Math.min(top,Math.min(left,top_left))+1;
                }
            }
        }
        return dp[word1.length()][word2.length()];

        
    }
}
