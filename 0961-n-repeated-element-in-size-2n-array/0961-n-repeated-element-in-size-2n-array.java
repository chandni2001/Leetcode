class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        int s=n/2;
        int c=1;
        int p=0;
        for(int i=0;i<n;i++){
            int temp=nums[i];
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c==s){
                p=temp;
                break;
            }
        }
        return p;
    }
}