class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                li.add(matrix[i][j]);
            }
        }
        Collections.sort(li);   
        int kth=0;
        for(int i=0;i<li.size();i++){
            kth=li.get(k-1);
        }
        return kth;
    }
}