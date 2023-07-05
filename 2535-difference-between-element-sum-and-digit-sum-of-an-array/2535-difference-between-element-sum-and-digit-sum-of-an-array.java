class Solution {
    public int differenceOfSum(int[] nums) {
        
        int total = 0;
        int digitSum = 0;
        for(int i=0;i<nums.length;i++){
            total += nums[i];
            
            digitSum += sum(nums[i]);
        }
        
        return Math.abs(total - digitSum);
        
    }
    int sum(int num){
        
        int s = 0;
        while(num > 0){
            s += num%10;
            num /= 10;
        }
        return s;
    }
}