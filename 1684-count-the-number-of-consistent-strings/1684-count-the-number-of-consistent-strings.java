class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> st = new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            char ch=allowed.charAt(i);
            if(!st.contains(ch)){
                st.add(ch);
            }
        }
        int c=0;
        for(int j=0;j<words.length;j++){
            boolean bl=true;
            String str = words[j];
            for(int i=0;i<str.length();i++){
                char ch1=str.charAt(i);
                if(!st.contains(ch1)){
                    bl=false;
                    break;
                }
            }
            if(bl==true){
                c++;
            }
        }
        return c;
    }
}