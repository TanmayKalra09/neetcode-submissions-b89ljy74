class Solution {
    private Map<String, Boolean> memo = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        return dfs(s, wordSet);
    }

    private boolean dfs(String s, Set<String> wordSet) {
        if (s.isEmpty()) return true;
        if (memo.containsKey(s)) return memo.get(s);

        for (int i = 1; i <= s.length(); i++) {  // Fix: i should go up to s.length()
            String prefix = s.substring(0, i);
            String suffix = s.substring(i);

            if (wordSet.contains(prefix) && dfs(suffix, wordSet)) {
                memo.put(s, true);
                return true;
            }
        }

        memo.put(s, false);
        return false;
    }
}