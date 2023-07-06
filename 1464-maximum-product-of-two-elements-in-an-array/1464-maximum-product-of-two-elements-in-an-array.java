class Solution {
    public int maxProduct(int[] nums) {
        int m=0;
        for(int i=0;i<nums.length;i=i+1){
            for(int j=i+1;j<nums.length;j++){
                int n =(nums[i]-1)*(nums[j]-1);
                if(n>m){
                    m=n;
                }
            }
        }
        return m;
    }
}