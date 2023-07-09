class Solution {
    public int[] singleNumber(int[] nums) {
        
        ArrayList<Integer> li = new ArrayList<Integer>();
       
        for(int i=0;i<nums.length;i++){
            int count=1;
            int temp=nums[i];
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(temp==nums[j]){
                    count++;
                }
            }
            if(count==1){
                li.add(temp);
            }
        }
        int[] a = new int[li.size()];
        for(int i=0;i<li.size();i++){
            a[i]=li.get(i);
        }
        return a;
    
    }
}