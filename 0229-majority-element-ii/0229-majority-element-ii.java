class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> li= new ArrayList<>();
        int n= nums.length;
        int m=n/3;
        for(int i=0;i<nums.length;i++){
            int c=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
                
            }
            if(c>m){
                li.add(nums[i]);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int a:li){
            if(!set.contains(a)){
                set.add(a);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int s:set){
            list.add(s);
        }
        return list;
    }
}