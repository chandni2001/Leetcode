class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a = new int[2];
        int s =0;
        int end = nums.length-1;
        int fi =-1;
        for(int i=0;i<2;){
           while(s<=end){
              int mid = (s+end)/2;
              if(target<nums[mid]){
                 end = mid-1;
              }
            
              else if(target>nums[mid]){
                  s=mid+1;
              }
              else{
                  fi=mid;
                  end=mid-1;
                
              }
            
           }
           a[i]=fi; 
           i++;
           s =0;
           end = nums.length-1;
           int li = -1;
           while(s<=end){
              int mid = (s+end)/2;
              if(target<nums[mid]){
                 end = mid-1;
              }
            
              else if(target>nums[mid]){
                  s=mid+1;
              }
              else{
                   li=mid;
                   s=s+1;
                    
              }
            
            }
            a[i]=li;
            return a;
        
    }
    int[] ar ={-1,-1};   
    return ar;   
}
}    