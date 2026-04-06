class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int c=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int l=1;
                while(set.contains(num+l)){
                    l++;
                }
                c=Math.max(c,l);
            }
        }
        return c;
        
    }
}
