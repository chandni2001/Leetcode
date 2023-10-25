class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> li = new ArrayList<>();
        
       int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                li.add(nums1[i]);
                i++;
                k++;
            }
            else{
                li.add(nums2[j]);
                j++;
                k++;
            }
        }
        while(i<nums1.length){
            li.add(nums1[i]);
            i++;
            k++;
        }
         while(j<nums2.length){
            li.add(nums2[j]);
            j++;
            k++;
        }
        int len = li.size();
        double mid =0;
        if(len%2==0){
            int n1 = len/2;
            int n2 =n1-1;
            int p = li.get(n1);
            int q = li.get(n2);
            return (double)(p+q)/2;
            
        }else{
            int n = len/2;
            mid = li.get(n);
        }
        return mid;
        
    }
}