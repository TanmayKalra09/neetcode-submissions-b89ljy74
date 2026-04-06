class Solution {
    private Map<String, Boolean> memo = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        // Set<String> wordSet = new HashSet<>(wordDict);
        return dfs(s, wordDict);
    }

    private boolean dfs(String s,List<String> wordDict ) {
        if (s.isEmpty()) return true;
        if (memo.containsKey(s)) return memo.get(s);

        for (int i = 0; i < s.length(); i++) {  // Fix: i should go up to s.length()
            String prefix = s.substring(0, i+1);
            String suffix = s.substring(i+1);

            if (wordDict.contains(prefix) && dfs(suffix, wordDict)) {
                memo.put(s, true);
                return true;
            }
        }

        memo.put(s, false);
        return false;
    }
}