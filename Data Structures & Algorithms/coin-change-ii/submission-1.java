

class Solution {
    public int change(int amount, int[] coins) {
        Arrays.sort(coins);
        Map<String, Integer> memo = new HashMap<>();
        return help(coins, 0, amount, memo);
    }

    private int help(int[] coins, int i, int amount, Map<String, Integer> memo) {
        if (amount == 0) return 1;
        if (i >= coins.length) return 0;

        String key = i + "," + amount;
        if (memo.containsKey(key)) return memo.get(key);

        int res = help(coins, i + 1, amount, memo); 
        if (amount >= coins[i]) {
            res += help(coins, i, amount - coins[i], memo);
        }

        memo.put(key, res);
        return res;
    }
}