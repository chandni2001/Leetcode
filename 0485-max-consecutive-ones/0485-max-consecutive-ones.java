class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int ci=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==1){
                c++;
                
                
            }
            if(c>ci){
                ci=c;
            }
            
            else if (nums[i]==0){
                c=0;
               
            }
            
        }
        return ci;
    }
}