class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            li.add(index[i],nums[i]);
        }
        int[] target = new int[li.size()];
        for(int i=0;i<li.size();i++){
            target[i]=li.get(i);
        }
        return target;
    }
}