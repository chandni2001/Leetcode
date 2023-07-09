class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int n=s.length()-1;
        int i=0;
        while(i<=n){
            char ch1=s.charAt(i);
            char ch2=s.charAt(n);
            if(ch1!=ch2){
                return false;
            }
            i++;
            n--;
        }
        return true;
    }
}