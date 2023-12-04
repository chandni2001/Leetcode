class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        List<Integer> li = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            
            if(nums[j]!=j+1){
                li.add(j+1);
            }
        }
         return li;
        
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}