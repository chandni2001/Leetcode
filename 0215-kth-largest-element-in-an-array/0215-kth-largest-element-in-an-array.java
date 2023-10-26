class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums){
            pq.add(i);
        }
        int elment=0;
        for(int j=0;j<k;j++){
            if(j==k-1){
                elment = pq.peek();
                break;
            }
            else{
                pq.remove();
                continue;
                
            }
        }
        return elment;
        
    }
}