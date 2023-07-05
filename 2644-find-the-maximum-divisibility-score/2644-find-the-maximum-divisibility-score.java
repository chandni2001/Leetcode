class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int n = nums.length;
        int d = divisors.length;
        int res = 0;
        int curr = -1;
        for(int i=0;i<d;i++){
            int count =0;
            int val = divisors[i];
            for(int j=0;j<n;j++){
                if(nums[j] % divisors[i]==0){
                    count++;
                }

            }
           if(count >= curr) {
                if(count  == curr) res = Math.min(res, divisors[i]);
                else res = divisors[i];

                curr = count;
           }
           
            
        }
        return res;
    }
}