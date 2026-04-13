class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,-1,1};
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    continue;
                }
                int a=0;
                grid[i][j]=0;
                Queue<int[]> queue = new LinkedList<>();
                queue.offer(new int[]{i,j});
                while(!queue.isEmpty()){
                    int[] curr = queue.poll();
                    a++;
                    for(int k=0;k<4;k++){
                        int nr = curr[0]+dx[k];
                        int nc = curr[1]+dy[k];
                        if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length){
                            continue;
                        }
                        if(grid[nr][nc]!=0){
                            grid[nr][nc]=0;
                            queue.offer(new int[]{nr,nc});
                        }
                    }
                    max=Math.max(max,a);
                }
            }
        }
        return max;
    }
}
