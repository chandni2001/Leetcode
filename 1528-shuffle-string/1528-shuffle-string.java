class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            for(int j=i;j<indices.length;j++){
                int p=indices[j];
                arr[p]=ch;
            }
        }
        String str="";
        for(int i=0;i<arr.length;i++){
            str=str+arr[i];
        }
        return str;
    }
}