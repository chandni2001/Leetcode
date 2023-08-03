class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> st=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            st.put(ch, st.getOrDefault(ch, 0) + 1);
        }
        
        for(int j=0;j<t.length();j++){
            char ch=t.charAt(j);
            
            if( !st.containsKey(ch) || (st.containsKey(ch) && st.get(ch) <= 0 )){
                return false;
            }
            
            st.put(ch, st.getOrDefault(ch, 0) - 1);
        }
        return true;
    }
}