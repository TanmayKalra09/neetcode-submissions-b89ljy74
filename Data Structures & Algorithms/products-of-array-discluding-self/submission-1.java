class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
            int c=0;
            int[] arr = new int[nums.length];
        for(int num: nums){
            if(num!=0){
                p=p*num;
            }
            else{
                c++;
            }
        }
        if(c>1){
            return new int[nums.length];
        }
            for(int i=0;i<nums.length;i++){
                if(c>0){
                    arr[i]=(nums[i]==0 ? p : 0);
                }
                else{
                    arr[i]=p/nums[i];
                }
            }
            return arr;
        

        
    }
}  
