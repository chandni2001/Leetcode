class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = matrix.length;
        int m= matrix[0].length;
        for(int i=0;i<n;i++){
            int num=Integer.MAX_VALUE;
            int index=-1;
            for(int j=0;j<m;j++){
                if(matrix[i][j]<num){
                    num=matrix[i][j];
                    index=j;
                }
            }
            boolean flage = true;
            for(int row=0;row<n;row++){
                if(matrix[row][index]>num){
                    flage=false;
                }
            }
             if(flage==true){
            list.add(num);
        }
        }
        return list;
        
    }
}