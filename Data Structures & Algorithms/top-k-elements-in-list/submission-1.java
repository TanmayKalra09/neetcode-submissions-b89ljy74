class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> n : map.entrySet()){
            List<Integer> l = new ArrayList<>();
            l.add(n.getKey());
            l.add(n.getValue());
            list.add(l);
        }
        list.sort((a,b)->b.get(1)-a.get(1));
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i).get(0);
        }
        return res;
    }
}
