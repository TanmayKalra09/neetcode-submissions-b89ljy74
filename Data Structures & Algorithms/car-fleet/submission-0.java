class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<position.length;i++){
            map.put(position[i],speed[i]);
        }
        Arrays.sort(position);
        double t = 0.0;
        int f=0;
        for(int i=position.length-1;i>=0;i--){
            int dis = target-position[i];
            double time = (double)dis/map.get(position[i]);
            if(time>t){
                f++;
                t=time;
            }
        }
        return f;
    }
}
