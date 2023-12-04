class Solution {
    public int findDuplicate(int[] nums) {
      int i = 0;
      while(i<nums.length){
          if(nums[i]!=i+1){ 
              int c = nums[i]-1;
              if(nums[i]!=nums[c]){
                  swap(nums,i,c);
              }
              else{
                 return nums[i];
              }
          }
          else{
              i++;
          }
      }
        return -1;
        
    }
   public  static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}