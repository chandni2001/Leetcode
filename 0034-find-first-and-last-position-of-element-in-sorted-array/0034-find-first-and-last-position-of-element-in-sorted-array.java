class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] ={-1,-1};
        int a =search(nums,target,true);
        int b = search(nums,target,false);
        arr[0]=a;
        arr[1]=b;
        return arr;
}
    int search(int[]nums,int target,boolean startindex){
        int ans =-1;
        int s =0;
        int e =nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target<nums[mid]){
                e=mid-1;
            }
            else if(target>nums[mid]){
                s=mid+1;
            }
            else{
                ans =mid;
                if(startindex){
                    e=mid-1;
                    
                }else{
                    s=mid+1;
                }
            }
        }
        return ans;
    }
}    