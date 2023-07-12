class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> inter = new HashSet<>();

        for(int i = 0; i < nums1.length; i++){
            if(!seen.contains(nums1[i])){
                seen.add(nums1[i]);
            }
        }

        for(int i = 0; i < nums2.length; i++){
            if(seen.contains(nums2[i])){
                inter.add(nums2[i]);
            }
        }
        int n = inter.size();
        int arr[] = new int[n];
  
        int i = 0;
        for (int x : inter)
            arr[i++] = x;
  
        return arr; 
    }
}