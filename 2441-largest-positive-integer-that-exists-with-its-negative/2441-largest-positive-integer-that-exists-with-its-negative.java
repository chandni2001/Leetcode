class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            int max=nums[i];
            for(int j=0;j<nums.length;j++){
                if(max==-nums[j]){
                    return max;
                }
            }
        }
        return -1;
    }
}