class Solution {
    public int splitArray(int[] nums, int k) {
        int start =0;
        int end =0;
        for(int i=0;i<nums.length;i++){
            start = Math.max(start,nums[i]);
            end+=nums[i];
        }
        
        while(start<end){
            
            int mid =start+(end-start)/2;
            int sum=0;
            int count=1;
            for(int n:nums){
                if(sum+n>mid){
                    sum=n;
                    count++;
                }else{
                    sum+=n;
                }
                
            }
            if(count<=k){
                end=mid;
            }
            else{
                start=mid+1;
            }
            
        }
        return end;
        
    }
}