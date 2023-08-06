class Solution {
    public String truncateSentence(String s, int k) {
        String [] arr = s.split(" ");
        String str= "";
        for(int i=0;i<arr.length;i++){
            if(i<k){
                str=str+arr[i];
                if(i==k-1){
                    break;
                }
                else{
                    str=str+" ";
                }
            }
            
        }
        return str;
    }
}