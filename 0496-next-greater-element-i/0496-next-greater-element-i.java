class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr =new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++){
            boolean bl=true;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    for(int s=j;s<nums2.length;s++){
                        if(nums2[s]>nums1[i]){
                        arr[i]=nums2[s];
                        bl=false;
                        break;
                        }
                    }
               }
           }
            if(bl==true){
                arr[i]=-1;
             }
                    
      }
     return arr;
    }
}