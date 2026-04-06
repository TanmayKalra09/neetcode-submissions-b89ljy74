class Solution {
    private HashMap<String, Boolean> map = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        return help(s, wordDict);
    }

    private boolean help(String s, List<String> wordDict) {
        if (s.isEmpty()) {
            return true;
        }

        if (map.containsKey(s)) {
            return map.get(s);
        }

        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);       // check from beginning
            String suffix = s.substring(i);          // remaining part

            if (wordDict.contains(prefix) && help(suffix, wordDict)) {
                map.put(s, true);
                return true;
            }
        }

        map.put(s, false);
        return false;
    }
}