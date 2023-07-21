class Solution {
    public int removeDuplicates(int[] nums) {
        final int k=2;
        if(nums.length==0){
            return 0;
        }
        int m=1;
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                if(c<k){
                    nums[m++]=nums[i];
                    
                }
                c++;
            }
            else{
              c=1;
              nums[m++]=nums[i];
            }
        }
        
        return m;
    }
}