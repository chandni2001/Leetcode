class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="";
        for(int i=0;i<word1.length;i++){
            str1=str1+word1[i];
        }
        String str3=str1;
        String str2="";
        for(int j=0;j<word2.length;j++){
            str2=str2+word2[j];
        }
        
        
        if(str1.compareTo(str2)==0){
            return true;
        }
        return false;
    }
}